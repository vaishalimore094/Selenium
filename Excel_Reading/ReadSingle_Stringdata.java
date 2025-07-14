package excel_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingle_Stringdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1----create file using fileinputstream----give path name along with extenction
	FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
	//2-
	String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);		


	}

}
