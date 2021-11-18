package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public ArrayList<String> getData(String test) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		ArrayList<String> arr = new ArrayList<String>();
		int column = 0;
		for (int i = 0; i < sheets; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase("Products")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(test)) {
						Iterator<Cell> testData = r.cellIterator();
						while (testData.hasNext()) {
							Cell c = testData.next();
							if (c.getCellType() == CellType.STRING) {
								arr.add(c.getStringCellValue());
							} else {
								arr.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}

						}
					}
				}
			}
		}
		return arr;
	}
}