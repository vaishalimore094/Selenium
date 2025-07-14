package excel_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelrow_count {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		
//------------you read empty cell value or delete that value--------nullpointerexpection comes
		
		//double value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
		
//------------how to get row count-------it search index base we get human size twy add + 1 ----------------------------------------
		
		 int Totalrows = WorkbookFactory.create(myfile).getSheet("Sheet1").getLastRowNum()+1;
		 System.out.println(Totalrows);
		
		

	}

}
//---note---by row count dont give the reference of coloumn
//---------by coloumn count give the reference of row