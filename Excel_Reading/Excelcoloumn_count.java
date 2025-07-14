package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelcoloumn_count {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
	
//-----------------	how to get coloum count-------it search size base  ----------------------------------------
	
	short Totalcoloumn = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(Totalcoloumn);

	}

}
//---------//---------by coloumn count give the reference of row
