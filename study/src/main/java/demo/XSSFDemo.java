package demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFDemo {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\ChenLong\\Desktop\\学习中遇到的问题.xlsx";
		XSSFWorkbook wb=new XSSFWorkbook(path);
		
		XSSFSheet sheet=wb.getSheet("实践");
		
		int firstRowNum=sheet.getFirstRowNum();
		int lastRowNum=sheet.getLastRowNum();
		ArrayList<String>list=new ArrayList<>();
		for(int rowNum=firstRowNum;rowNum<=lastRowNum;rowNum++) {
			
			XSSFRow row=sheet.getRow(rowNum);
			
			int firstCellNum=row.getFirstCellNum();
			int lastCellNum=row.getLastCellNum();
			
			for(int cellNum=firstCellNum;cellNum<lastCellNum;cellNum++) {
				XSSFCell cell=row.getCell(cellNum);
				
				CellType cellType=cell.getCellType();
				switch(cellType) {
					case _NONE://程序也不知道什么类型
						break;
					case BLANK:	
						System.out.println("BLANK类型-无值");
					case STRING:
						String value=cell.getStringCellValue();
						list.add(value);
						break;
					case FORMULA:
						String formula=cell.getCellFormula();
						break;
					case NUMERIC:
						double d=cell.getNumericCellValue();
						break;
					case BOOLEAN:
						boolean b=cell.getBooleanCellValue();
						break;
					case ERROR:
						String error=cell.getErrorCellString();
						break;					
				}
			}
			
		}
		int size=list.size();
		String[] string=list.toArray(new String[size]);
		System.out.println(Arrays.toString(string));


	}

}
