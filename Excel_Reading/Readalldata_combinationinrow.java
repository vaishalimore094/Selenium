package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readalldata_combinationinrow {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
			
			Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet4");
			 int lastrowindex = sh.getLastRowNum();
			 for(int i=0;i<=lastrowindex;i++) 
			 {
			
			    Cell cellinfo = sh.getRow(i).getCell(0);
			     CellType cellinfotype = cellinfo.getCellType();
			      //System.out.println(cellinfotype);
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

}
//-----read all datatype in row ata time----------------------