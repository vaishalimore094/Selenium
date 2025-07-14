package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_reading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//1.....//-----path of excel file-----
		
	    FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
	    
//2.----// creating workbook-----------
	    
      //String output = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     //System.out.println(output);
     String playername = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
     System.out.println(playername);
     
  //Workbook book = WorkbookFactory.create(myfile);
  //Sheet sh= book.getSheet("Sheet1");----------getsheet
   //Row rw = sh.getRow(0);----------------get row
    //Cell cl = rw.getCell(0);-------------getcoloumn
   //String value = cl.getStringCellValue();-----getstring,intvalue
    //System.out.println(value);
    

	}
}
