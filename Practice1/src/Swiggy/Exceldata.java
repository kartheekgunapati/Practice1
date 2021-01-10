package Swiggy;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Exceldata(String sheetpath) throws Exception {
		File src = new File(sheetpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
	
	
	public int rowCount(int sno) {
		int row = wb.getSheetAt(sno).getLastRowNum();
		row = row+1;
		return row;
	}
	
	public String udetails(int snum,int r,int c) {
		sheet = wb.getSheetAt(snum);
		String udata = sheet.getRow(r).getCell(c).getStringCellValue();
		return udata;
	}

}
