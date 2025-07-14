package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getalldata_coloumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		
		 Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 
		 int rowindex = sh.getLastRowNum();
		 
			System.out.println("cell index count is"+rowindex);
			
				for(int i=0;i<=rowindex;i++)
				{
					 String value = sh.getRow(i).getCell(2).getStringCellValue();
					 System.out.println(value);
				}
		
		

	}

}
