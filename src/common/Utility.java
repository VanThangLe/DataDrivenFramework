package common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {

	private static XSSFWorkbook workBook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	private static XSSFRow row;

	//Set config to read or write excel file
	public static void setExcelFile(String excelPath, String sheetName) throws Exception {
		try {
			FileInputStream file = new FileInputStream(excelPath);
			workBook = new XSSFWorkbook(file);
			sheet = workBook.getSheet(sheetName);
		} catch (Exception e) {
			throw (e);
		}
	}
	
	//Read file excel
	public static String getCellData(int rowNumber, int columnNumber) throws Exception {
		//setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Login");
		try {
			cell = sheet.getRow(rowNumber).getCell(columnNumber);
			String cellData = cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			throw (e);
		}
	}

	//Write file excel
	@SuppressWarnings("static-access")
	public static void setCellData(String result, int rowNumber, int columnNumber) throws Exception {
		try {
			row = sheet.getRow(rowNumber);
			cell = row.getCell(columnNumber, row.RETURN_BLANK_AS_NULL);
			if (cell == null) {
				cell = row.createCell(columnNumber);
				cell.setCellValue(result);
			} else {
				cell.setCellValue(result);
			}
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			workBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

	//Read file config properties
	public static Object fetchPropertyValue(String key) throws IOException {
		FileInputStream file = new FileInputStream("./config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	}

	//Read file element properties
	public static String fetchLocatorValue(String key) throws IOException {
		FileInputStream file = new FileInputStream("./config/elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}
}
