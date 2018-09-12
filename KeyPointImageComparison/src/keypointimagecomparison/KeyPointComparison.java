package keypointimagecomparison;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.opencv.calib3d.Calib3d;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.DMatch;
import org.opencv.core.KeyPoint;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.features2d.BFMatcher;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FastFeatureDetector;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.features2d.FlannBasedMatcher;
import org.opencv.features2d.ORB;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class KeyPointComparison {
	
	public static void main(String[] args) {
		
		String path1 = "Giraffe.jpg", path2 = "GiraffeInstagram.jpg";
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		FastFeatureDetector detector = FastFeatureDetector.create(15, false, FeatureDetector.FAST);
		DescriptorExtractor descriptor = DescriptorExtractor.create(DescriptorExtractor.ORB);
		BFMatcher matcher = BFMatcher.create();

		// DETECTION
		// first image
		Mat img1 = Imgcodecs.imread(path1, Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
		Mat blur1 = new Mat();
		Imgproc.blur(img1, blur1, new Size(5, 5));
		Mat descriptors1 = new Mat();
		MatOfKeyPoint keypoints1 = new MatOfKeyPoint();

		detector.detect(blur1, keypoints1);
		descriptor.compute(blur1, keypoints1, descriptors1);

		// second image
		Mat img2 = Imgcodecs.imread(path2, Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
		Mat blur2 = new Mat();
		Imgproc.blur(img2, blur2, new Size(5, 5));
		Mat descriptors2 = new Mat();
		MatOfKeyPoint keypoints2 = new MatOfKeyPoint();

		detector.detect(blur2, keypoints2);
		descriptor.compute(blur2, keypoints2, descriptors2);
		
		// MATCHING
		// match these two keypoints sets
		List<MatOfDMatch> matches = new ArrayList<MatOfDMatch>();
		matcher.knnMatch(descriptors1, descriptors2, matches, 7);
		
		// ratio test
	    LinkedList<DMatch> good_matches = new LinkedList<DMatch>();
	    for (Iterator<MatOfDMatch> iterator = matches.iterator(); iterator.hasNext();) {
	        MatOfDMatch matOfDMatch = (MatOfDMatch) iterator.next();
	        if (matOfDMatch.toArray()[0].distance / matOfDMatch.toArray()[1].distance < 0.9) {
	            good_matches.add(matOfDMatch.toArray()[0]);
	        }
	    }

	    // get keypoint coordinates of good matches to find homography and remove outliers using ransac
	    List<Point> pts1 = new ArrayList<Point>();
	    List<Point> pts2 = new ArrayList<Point>();
	    
	    for(int i = 0; i<good_matches.size(); i++){
	        pts1.add(keypoints1.toList().get(good_matches.get(i).queryIdx).pt);
	        pts2.add(keypoints2.toList().get(good_matches.get(i).trainIdx).pt);
	    }

	    // convertion of data types - there is maybe a more beautiful way
	    Mat outputMask = new Mat();
	    MatOfPoint2f pts1Mat = new MatOfPoint2f();
	    pts1Mat.fromList(pts1);
	    MatOfPoint2f pts2Mat = new MatOfPoint2f();
	    pts2Mat.fromList(pts2);

	    // Find homography - here just used to perform match filtering with RANSAC, but could be used to e.g. stitch images
	    // the smaller the allowed reprojection error (here 15), the more matches are filtered 
	    Mat Homog = Calib3d.findHomography(pts1Mat, pts2Mat, Calib3d.RANSAC, 15, outputMask, 2000, 0.995);

	    // outputMask contains zeros and ones indicating which matches are filtered
	    LinkedList<DMatch> better_matches = new LinkedList<DMatch>();
	    for (int i = 0; i < good_matches.size(); i++) {
	        if (outputMask.get(i, 0)[0] != 0.0) {
	            better_matches.add(good_matches.get(i));
	        }
	    }

	    // DRAWING OUTPUT
	    Mat outputImg = new Mat();
	    // this will draw all matches, works fine
	    MatOfDMatch better_matches_mat = new MatOfDMatch();
	    better_matches_mat.fromList(better_matches);
	    Features2d.drawMatches(img1, keypoints1, img2, keypoints2, better_matches_mat, outputImg);

	    // save image
	    Imgcodecs.imwrite("result.jpg", outputImg);
	    
	    System.out.println(better_matches_mat.toArray().length+" matches found out of " + keypoints2.toArray().length);
	    
	    
	  
	}

}
