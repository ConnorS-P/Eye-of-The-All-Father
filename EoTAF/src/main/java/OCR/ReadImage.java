package OCR;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {

	public static void main(String[] args) {
		ITesseract image = new Tesseract();
		try {
			String str = image.doOCR(new File("C:\\Users\\rionr\\Downloads\\test4.png"));
			System.out.println(str);
		} catch(TesseractException e){
			System.out.println(e.getMessage());
		}
		
	}

}
