package tests;

import java.util.Vector;

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
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class EdgeImageExtraction {
	
	public static void main(String[] args) {
	
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		Mat img1 = Imgcodecs.imread("StatueOfLiberty", 1);
		
		Mat img2 = new Mat();
		
		Imgproc.cvtColor(img1, img2, Imgproc.COLOR_RGB2GRAY);
		
		Imgproc.Canny(img1, img1, 100, 200);
		
		
	
	}
}
