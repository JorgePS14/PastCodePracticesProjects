package CannyAlgorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.opencv.calib3d.Calib3d;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.DMatch;
import org.opencv.core.Mat;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.core.MatOfDMatch;

public class EdgeDetection {
	
	public EdgeDetection() {};

	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		Mat color1 = Imgcodecs.imread("V:\\ImageComparisonImages\\Cube1.jpg");
		
		Mat grey1 = new Mat();
		Mat draw1 = new Mat();
		Mat wide1 = new Mat();
		Mat thr1 = new Mat();
		
		Imgproc.cvtColor(color1, grey1, Imgproc.THRESH_BINARY);
		Imgproc.Canny(grey1, wide1, 50, 127.5, 3, false);
		wide1.convertTo(draw1, CvType.CV_8U);
		
		
		
		
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\Cube1Edges.png", draw1)) {
			System.out.println("Edges for image 1 detected.");
		}
		
		Imgproc.threshold(grey1, thr1, 100, 255, Imgproc.THRESH_BINARY);
		
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\Cube1Binary.png", thr1)) {
			System.out.println("Binary for image 1 created");
		}

		
		Mat color2 = Imgcodecs.imread("V:\\ImageComparisonImages\\Cube2.png");
		
		Mat grey2 = new Mat();
		Mat draw2 = new Mat();
		Mat wide2 = new Mat();
		Mat thr2 = new Mat();
		
		Imgproc.cvtColor(color2, grey2, Imgproc.COLOR_BGR2GRAY);
		Imgproc.Canny(grey2, wide2, 50, 127.5, 3, false);
		wide2.convertTo(draw2, CvType.CV_8U);
		
				
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\Cube2Edges.png", draw2)) {
			System.out.println("Edges for image 2 detected.");
		}
		
		Imgproc.threshold(grey2, thr2, 50, 255, Imgproc.THRESH_BINARY);
		
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\Cube2Binary.png", thr2)) {
			System.out.println("Binary for image 2 created");
		}
		
		Mat color3 = Imgcodecs.imread("V:\\ImageComparisonImages\\StatueOfLiberty.jpg");
		
		Mat grey3 = new Mat();
		Mat draw3 = new Mat();
		Mat wide3 = new Mat();
		Mat thr3 = new Mat();
		
		Imgproc.cvtColor(color3, grey3, Imgproc.COLOR_BGR2GRAY);
		Imgproc.Canny(grey3, wide3, 75, 127.5, 3, false);
		wide3.convertTo(draw3, CvType.CV_8U);
		
				
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\StatueOfLibertyEdges.png", draw3)) {
			System.out.println("Edges for image 3 detected.");
		}
		
		Imgproc.threshold(grey3, thr3, 75, 255, Imgproc.THRESH_BINARY);
		
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\StatueOfLibertyBinary.png", thr3)) {
			System.out.println("Binary for image 3 created");
		}
		
		Mat binCan = new Mat();
		
		Imgproc.Canny(thr3, binCan, 255, 255, 3, false);
		
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\StatueOfLibertyBinaryCanny.png", binCan)) {
			System.out.println("Binary Canny for image 3 created");
		}
		
		Mat result = new Mat();
		
		Mat resize1 = new Mat();
		Mat resize2 = new Mat();
		Size size = new Size(480, 480);
		
		Imgproc.resize(color2, resize1, size);
		Imgproc.resize(color3, resize2, size);
		
		Imgproc.matchTemplate(resize1, resize2, result, 0);
		
		
		if(Imgcodecs.imwrite("V:\\ImageComparisonImages\\ResultImage.png", result)) {
			System.out.println("Result Image complete.");
		}
		
		EdgeDetection ed = new EdgeDetection();
		
		System.out.println(ed.getSimilarity(resize1, resize2));
		
		
		
		
		//KeyPoint Comparison tests
		
		System.out.println("\n");
		System.out.println("Keypoint Comparison test step 1 \n\n");
		
		
		Mat img;
		
		img = Imgcodecs.imread("V:\\ImageComparisonImages\\Cube2.png");
		
		//System.out.println(img);
		
		Imgcodecs.imwrite("out.png", img);
		
		Mat blurredImage = new Mat();
		
		Imgproc.blur(img, blurredImage, new Size(10, 10));
		/*
		Mat hsvImage = new Mat();
		
		Imgproc.cvtColor(blurredImage, hsvImage, Imgproc.COLOR_BGR2HSV);
		
		Imgcodecs.imwrite("HSVImage.jpg", hsvImage);
		
		*/
		
		Mat grey = new Mat(img.width(), img.height(), CvType.CV_8U, new Scalar(4));
		
		Imgproc.cvtColor(blurredImage, grey, Imgproc.COLOR_RGB2GRAY);
		
		FeatureDetector fd = FeatureDetector.create(FeatureDetector.GFTT);
		
		
		//System.out.println(FeatureDetector.GFTT);
		
		
		MatOfKeyPoint regions = new MatOfKeyPoint();
		
		fd.detect(grey, regions);
		
		Mat output = new Mat();
		
		Features2d.drawKeypoints(grey, regions, output);
		
		Imgcodecs.imwrite("out.png", output);
		
		//double p = ed.getSimilarity(resize1, resize2);
		
		//System.out.println(p);
		
		System.out.println("Keypoint Comparison test step 2 \n\n");
		
		Mat img2;
		
		
		img2 = Imgcodecs.imread("V:\\ImageComparisonImages\\RubiksCube.jpg");
		
		Imgcodecs.imwrite("out2.png", img2);
		
		Mat blurredImage2 = new Mat();
		
		Imgproc.blur(img2,  blurredImage2,  new Size(10, 10));
		
		Mat gray = new Mat(img2.width(), img2.height(), CvType.CV_8U, new Scalar(4));
		
		Imgproc.cvtColor(blurredImage, gray, Imgproc.COLOR_RGB2GRAY);
		
		MatOfKeyPoint regions2 = new MatOfKeyPoint();
		
		fd.detect(gray, regions2);
		
		Mat output2 = new Mat();
		
		Features2d.drawKeypoints(gray, regions2, output2);
		
		Imgcodecs.imwrite("out2.png", output2);
		
		System.out.println("KeyPoint Comparison test step 3 \n\n");
		
		DescriptorExtractor de = DescriptorExtractor.create(DescriptorExtractor.ORB);
		
		DescriptorMatcher dm = DescriptorMatcher.create(DescriptorMatcher.BRUTEFORCE);
		
		List<MatOfDMatch> matches = new ArrayList<MatOfDMatch>();
		
		Mat descriptors1 = new Mat(), descriptors2 = new Mat();
		
		de.compute(img, regions, descriptors1);
		de.compute(img2, regions2, descriptors2);
		
		
		
		dm.knnMatch(descriptors1, descriptors2, matches, 2);
		
		LinkedList<DMatch> good_matches = new LinkedList<DMatch>();
		
		for(Iterator<MatOfDMatch> iterator = matches.iterator(); iterator.hasNext();) {
			MatOfDMatch mat = (MatOfDMatch) iterator.next();
			if(mat.toArray()[0].distance / mat.toArray()[1].distance < 0.9) {
				good_matches.add(mat.toArray()[0]);
			}
		}
		
		List<Point> pts1 = new ArrayList<Point>();
		List<Point> pts2 = new ArrayList<Point>();
		
		for(int i = 0; i < good_matches.size(); i++) {
			pts1.add(regions.toList().get(good_matches.get(i).queryIdx).pt);
			pts2.add(regions2.toList().get(good_matches.get(i).queryIdx).pt);
		}
		
		Mat outputMask = new Mat();
		
		MatOfPoint2f pts1Mat = new MatOfPoint2f();
		pts1Mat.fromList(pts1);
		MatOfPoint2f pts2Mat = new MatOfPoint2f();
		pts1Mat.fromList(pts2);
		
		Mat homog = Calib3d.findHomography(pts1Mat,  pts2Mat, Calib3d.RANSAC, 15, outputMask, 2000, 0.995);
		
		LinkedList<DMatch> better_matches = new LinkedList<DMatch>();
		
		for(int i = 0; i < good_matches.size(); i++) {
			if(outputMask.get(i, 0)[0] != 0.0) {
				better_matches.add(good_matches.get(i));
			}
		}
		
		Mat outputImage = new Mat();
		
		MatOfDMatch better_matches_mat = new MatOfDMatch();
		
		better_matches_mat.fromList(better_matches);
		
		Features2d.drawMatches(img, regions, img2, regions2, better_matches_mat, outputImage);
		
		Imgcodecs.imwrite("matchesResult.png", outputImage);
		
		
	}
	
	public double getSimilarity(Mat A, Mat B ) {
		if ( A.rows() > 0 && A.rows() == B.rows() && A.cols() > 0 && A.cols() == B.cols() ) {
		    // Calculate the L2 relative error between images.
		    double errorL2 = Core.norm( A, B, Core.NORM_L2);
		    // Convert to a reasonable scale, since L2 error is summed across all pixels of the image.
		    double similarity = errorL2 / (double)( A.rows() * A.cols() );
		    return similarity;
		}
		else {
		    //Images have a different size
		    return 100000.0;  // Return a bad value
		}
	}
}
