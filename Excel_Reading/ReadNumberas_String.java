package excel_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumberas_String {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		
//--------	how to read string value--------------------
			
			//String readstringvalue= WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
			//	System.out.println(readstringvalue);


	

////--------	how to read newmeric number  get in string value--------------------
	
	    //String readnewmericvalue= WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();
		//System.out.println(readnewmericvalue);//-----illegalstateExpection comes
		
//--------overcome by illigal exception--------by use ('1233444)		

        String readnewmericvalue= WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(readnewmericvalue);

}
}
