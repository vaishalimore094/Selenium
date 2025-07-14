package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getalldata_roow {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			//1----create file and give pathalong with extenction
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
//----------static type----------------		 
		 
	//	for(int i=0;i<=2;i++)
		//{
		//	 String value = sh.getRow(0).getCell(i).getStringCellValue();
		//	 System.out.println(value);
		//}
	 
//-------dynamic codind for row reading count  ------------------- 
		
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;	
		System.out.println("cell index count is"+lastcellindex);
		
			for(int i=0;i<=lastcellindex;i++)
			{
				 String value = sh.getRow(0).getCell(i).getStringCellValue();
				 System.out.println(value);
			}
	
   
	}

}
