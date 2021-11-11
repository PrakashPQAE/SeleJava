package JavaTutorials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		FileInputStream fis = new  FileInputStream("./TestExcelSheet/Data.xlsx");
		
		XSSFWorkbook workBook = new  XSSFWorkbook(fis);
		
		int totalWorkSheets = workBook.getNumberOfSheets();
		
		System.out.println(totalWorkSheets);
		
		XSSFSheet workSheet  = workBook.getSheetAt(0);		
		
		Iterator<Row> allRows=  workSheet.iterator();
		
		while(allRows.hasNext()) {
			
			Row eachRow = allRows.next();
			
			//System.out.println(eachRow.getCell(0).getStringCellValue());
			
			Iterator<Cell> allCells= eachRow.cellIterator();
			
			while(allCells.hasNext()) {
				
				Cell eachCell = allCells.next();
				
				System.out.println(eachCell.getStringCellValue());
			}
		}
				
		workBook.close();
	}

}
