import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ContourExtraction {

	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

	    // Consider the image for processing
	    Mat image = Imgcodecs.imread("StatueOfLiberty.jpg", Imgproc.COLOR_BGR2GRAY);
	    Mat imageHSV = new Mat(image.size(), CvType.CV_8U);
	    Mat imageBlurr = new Mat(image.size(), CvType.CV_8U);
	    Mat imageA = new Mat(image.size(), CvType.CV_8U);
	    Imgproc.cvtColor(image, imageHSV, Imgproc.COLOR_BGR2GRAY);
	    Imgproc.GaussianBlur(imageHSV, imageBlurr, new Size(5,5), 0);
	    Imgproc.adaptiveThreshold(imageBlurr, imageA, 255,Imgproc.ADAPTIVE_THRESH_MEAN_C, Imgproc.THRESH_BINARY,7, 5);

	    Imgcodecs.imwrite("test1.png", imageBlurr);

	    List<MatOfPoint> contours = new ArrayList<MatOfPoint>();    
	    Imgproc.findContours(imageA, contours, new Mat(), Imgproc.RETR_LIST,Imgproc.CHAIN_APPROX_SIMPLE);
	    //Imgproc.drawContours(imageBlurr, contours, 1, new Scalar(0,0,255));
	    for(int i=0; i< contours.size();i++){
	        System.out.println(Imgproc.contourArea(contours.get(i)));
	        if (Imgproc.contourArea(contours.get(i)) > 50 ){
	            Rect rect = Imgproc.boundingRect(contours.get(i));
	            System.out.println(rect.height);
	            if (rect.height > 28){
	            //System.out.println(rect.x +","+rect.y+","+rect.height+","+rect.width);
	            Imgproc.rectangle(image, new Point(rect.x,rect.y), new Point(rect.x+rect.width,rect.y+rect.height),new Scalar(0,0,255));
	            }
	        }
	    }
	    Imgcodecs.imwrite("test2.png",image);
	    
	    
	    Mat img = Imgcodecs.imread("StatueOfLiberty.jpg");
	    if(img.empty() == true) {
	        System.out.println("Error: no image found!");
	    }

	    List<MatOfPoint> cntrs = new ArrayList<MatOfPoint>();
	    Mat image32S = new Mat();
	    img.convertTo(image32S, CvType.CV_32SC1);

	    Imgproc.findContours(image32S, cntrs, new Mat(), Imgproc.RETR_FLOODFILL, Imgproc.CHAIN_APPROX_SIMPLE);

	    // Draw all the contours such that they are filled in.
	    Mat contourImg = new Mat(image32S.size(), image32S.type());
	    for (int i = 0; i < cntrs.size(); i++) {
	        Imgproc.drawContours(contourImg, cntrs, i, new Scalar(255, 255, 255), -1);
	    }

	    Imgcodecs.imwrite("debug_image.jpg", contourImg); // DEBUG
	}

}
