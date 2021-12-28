package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromExcelfile {
	
	public static void main(String[] args) throws  IOException  {
		
		FileInputStream fis = new FileInputStream("./CommonDataExcelFile.xlsx");
		
		Workbook wbf = WorkbookFactory.create(fis);
		
		/*Sheet sheet = wbf.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		/*String value = wbf.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value);*/
		
		int i,j;
		for (int i1 = 0; i1 <=1; i1++) {
			
			for(int j1 = i1; j1<=10; j1++) {
				
				String value = wbf.getSheet("Sheet1").getRow(j1).getCell(i1).getStringCellValue();
				
				System.out.println(value);
				
				}
			
			
		}
		
	}
	
	
}
		
		
