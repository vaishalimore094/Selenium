package excel_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readalldatatypecombinationinrowcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet4");
		Cell cellinfo = sh.getRow(0).getCell(0);
		CellType cellinfotype = cellinfo.getCellType();
		System.out.println(cellinfotype);
		if(cellinfotype==CellType.STRING)
		{
			String value = cellinfo.getStringCellValue();
			System.out.println(value);
		}
		else if(cellinfotype==CellType.NUMERIC)
		{
			 double value = cellinfo.getNumericCellValue();
			System.out.println(value);
		}
		else if(cellinfotype==CellType.BOOLEAN)
		{
			 boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value);
		}
		
		
	}

}
//----only read all datatype o=row(0)and coloumn(0)
