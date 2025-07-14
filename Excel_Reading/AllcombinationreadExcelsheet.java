package excel_Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllcombinationreadExcelsheet {


		public static void main(String[] args) throws EncryptedDocumentException, IOException {

			FileInputStream myfile=new FileInputStream("D:\\appache poi setup\\seleniumEXCEL.xlsx");
			
			Sheet sh= WorkbookFactory.create(myfile).getSheet("Sheet4");
			  int totalnoofrow = sh.getLastRowNum();
			 for(int i=0;i<=totalnoofrow;i++) 
			 {
				 int totalnoofcell = sh.getRow(i).getLastCellNum()-1;
				 for(int j=0;j<=totalnoofcell;j++) 
				 {
			
			    Cell cellinfo = sh.getRow(i).getCell(j);
			     CellType cellinfotype = cellinfo.getCellType();
			      //System.out.println(cellinfotype);
			if(cellinfotype==CellType.STRING)
			{
				String value = cellinfo.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(cellinfotype==CellType.NUMERIC)
			{
				 double value = cellinfo.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(cellinfotype==CellType.BOOLEAN)
			{
				 boolean value = cellinfo.getBooleanCellValue();
				System.out.print(value +" ");
			}
				 }
			System.out.println();
		
			}
		}
		

	}


