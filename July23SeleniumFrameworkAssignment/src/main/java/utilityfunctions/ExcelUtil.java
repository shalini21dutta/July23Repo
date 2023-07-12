package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	static XSSFWorkbook workbook=null;
	static XSSFSheet sheet1=null;
	
	public static void getSheet() {
	
	try {
		workbook=new XSSFWorkbook("C:\\Users\\suhas\\eclipse-workspace\\July23SeleniumFrameworkAssignment\\src\\main\\java\\testdata\\Data.xlsx");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	sheet1=workbook.getSheet("Sheet1");
	
}
	
	public static int getNoOfRows() {
	getSheet();
	int rowcount= sheet1.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	return rowcount;
	}
	
	public static int getNoOfCols() {
	getSheet();
	int colcount=sheet1.getRow(0).getPhysicalNumberOfCells();
	System.out.println(colcount);
	return colcount;
	}
	
	public static String getCellData(int rno,int cno){
	getSheet();
	String data=sheet1.getRow(rno).getCell(cno).getStringCellValue();
	System.out.println(data);
	return data;
	}
		


}
