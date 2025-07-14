package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readall_data {

	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
//1-------first read row--------------------				
//		int lastrowindex = sh.getLastRowNum();//--total row count
//		int lastcoloumnindex = sh.getRow(i).getLastCellNum()-1;//---total coloumn count
//		System.out.println(lastrowindex);//----verifycorrect ans
		
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		
	    for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)	
	      {
		         String value = sh.getRow(i).getCell(j).getStringCellValue();
		         
		         System.out.print(value+"   ");
		
	         }
	             System.out.println();
	 }
	

	}

}
