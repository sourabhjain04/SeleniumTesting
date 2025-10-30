package SeleniumDay4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1. Create object of workbook
		
		FileInputStream fis = new FileInputStream("C:\\data\\logindata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		// Create object of sheet and allocate respective sheet
		
		int numsheet = workbook.getNumberOfSheets();
		
		XSSFSheet sheet = null;
		
		for(int i=0; i<numsheet; i++) {
			if(workbook.getSheetName(i).equals("Sheet1")) {
				sheet = workbook.getSheetAt(i);
			}
		}
		
		
		// Fetch data from sheet using two iterators row and cell:
		
		Iterator<Row> itrow = sheet.iterator();
		
		while(itrow.hasNext()) {
			Row row = itrow.next();
			Iterator itcell = row.cellIterator();
			
			Cell c = (Cell) itcell.next();
			
			if(c.getStringCellValue().equals("Mayur Chavan")) {
				while(itcell.hasNext()) {
					c = (Cell) itcell.next();
					if(c.getCellType()==CellType.STRING) {
					System.out.println(c.getStringCellValue());
				}else if(c.getCellType()==CellType.NUMERIC) {
					System.out.println(c.getNumericCellValue());
				}
				}
			}
			
		}
	}

}
