package automated_tests;

import java.io.FileInputStream;


import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	//XSSF works with the xlsx format
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;

	//Opens the Excel file and sheet
	public static void setExcelFile(String path) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheetAt(0);
		} catch (Exception e) {
			throw(e);
		}
	}
	
	public static String[][] getTestData() {
		String[][] testData = null;
		int rowNum = 0;
		int colNum = 0;
		int lastRowNum = ExcelWSheet.getLastRowNum() + 1;
		int lastColNum = ExcelWSheet.getRow(0).getLastCellNum();
		
		testData = new String[lastRowNum][lastColNum];

		try {			
			for (Row row : ExcelWSheet) {
				for (Cell cell: row) {
					 testData[rowNum][colNum] = cell.getRichStringCellValue().getString();
					 colNum++;
				}
				rowNum++;
				colNum = 0;
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testData;
	}
}



