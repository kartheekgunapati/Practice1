package YahooDDTesting;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperation {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Exceloperation(String sheetname) throws Exception {
		File src = new File(sheetname);
		FileInputStream fis = new FileInputStream(src);
		wb =new XSSFWorkbook(fis);
	}
	
	public int getCount(int sno) {
		int row = wb.getSheetAt(sno).getLastRowNum();
		row = row+1;
		return row;
	}
	
	public String yahooData(int sheetnum,int row, int column) {
		sheet = wb.getSheetAt(sheetnum);
		String data1 = sheet.getRow(row).getCell(column).getStringCellValue();
		return data1;
	}
	

}
