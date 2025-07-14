package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelcellvaluevalidation {


		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			//1----create file and give pathalong with extenction
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		
		//2-------get string------
		
		// CellType ct = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
		//System.out.println(ct);
		
		//3---------get newmeric---
		
		//CellType ct1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getCellType();
		//System.out.println(ct1);
		
		//-----get boolean-----
		
		CellType ct2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getCellType();
		System.out.println(ct2);		


	}

}
