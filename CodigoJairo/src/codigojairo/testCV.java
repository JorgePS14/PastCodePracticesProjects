package codigojairo;

import java.awt.image.BufferedImage;
import java.io.File;

public class testCV
{
	public static void main(String[] args)
	{
		
		File dir = new File("V:\\ImageFolder");
		File[] directoryListing = dir.listFiles();
		
		String ext1 = ".png";
		String ext2 = ".jpg";
		String ext3 = ".bmp";
		String ext4 = ".gif";
		
		
		//Crea el objeto de Computer Vision
		myCV cvLibrary = new myCV();
		
		for (File child : directoryListing) {
			
			System.out.println(child.getName());
			
			//Lee una imagen
			Mat rgbImage = new Mat();
			rgbImage = cvLibrary.readImage(child.getName());
			
			//Guarda una imagen a un archivo
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("copy");
			sb.append(stripExtension(child.getName()));
			sb.append(ext1);
			
			String prueba = sb.toString();
			cvLibrary.savePNG(prueba, rgbImage );
			
			sb = new StringBuilder();
			
			sb.append("grey");
			sb.append(stripExtension(child.getName()));
			sb.append(ext2);
			
			System.out.println(sb.toString());
			
			//Obtiene e imprime las dimensiones de la imagen leída
			int W, H;
			W = rgbImage.getWidth();
			H = rgbImage.getHeight();
			
			//Transforma de RGB a escala de grises
			BufferedImage grayImage = cvLibrary.convertToGrayScale( rgbImage, BufferedImage.TYPE_BYTE_GRAY );
			cvLibrary.saveJPG(sb.toString(), grayImage );
			
			sb = new StringBuilder();
			
			sb.append("half");
			sb.append(stripExtension(child.getName()));
			sb.append(ext3);
			
			//Cambia el tamaño de la imagen a la mitad
			BufferedImage halfImage = cvLibrary.resizeImage(rgbImage,(int)(W*0.5),(int)(H*0.5));
			cvLibrary.saveGIF(sb.toString(), halfImage );
			
			sb = new StringBuilder();
			
			sb.append("double");
			sb.append(stripExtension(child.getName()));
			sb.append(ext4);
			
			//Cambia el tamaño de la imagen a la mitad
			BufferedImage doubleImage = cvLibrary.resizeImage(rgbImage,(int)(W*2),(int)(H*2));
			cvLibrary.saveBMP(sb.toString(), doubleImage );
		}
		
		
		
	}
	
	static String stripExtension(String str) {
        // Handle null case specially.

        if (str == null) 
        	return null;

        // Get position of last '.'.

        int pos = str.lastIndexOf(".");

        // If there wasn't any '.' just return the string as is.

        if (pos == -1) return str;

        // Otherwise return the string, up to the dot.

        return str.substring(0, pos);
    }
}
