package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	private static Object XSSFCell;

	public static void main(String[] args) throws Exception {
		/*
		 * 1、读取excel里某个sheet表的内容存入HashMap
		 * 2、将HashMap里的内容输出至另一个excel里
		 *
		 */
		HashMap<Integer,HashMap<Integer,String>> map=new HashMap<Integer,HashMap<Integer,String>>();
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		XSSFWorkbook wb=new XSSFWorkbook("C:\\\\Users\\\\ChenLong\\\\Desktop\\\\a.xlsx");
		XSSFSheet  sheet =wb.getSheetAt(0);
		int firstIndex=sheet.getFirstRowNum();
		int lastIndex=sheet.getLastRowNum();
		for(int i=firstIndex ;i<=lastIndex ;i++) {
			XSSFRow row=sheet.getRow(i);
			int firstColumn =row.getFirstCellNum();
			int lastColumn =row.getLastCellNum();
			for(int j=firstColumn ;j<lastColumn ;j++) {
				XSSFCell cell=row.getCell(j);
			    String value=cell.getStringCellValue();
			    System.out.println(value);
			    map2.put(j, value);			
		}
			map.put(i, map2);
		}
		Set<Map.Entry<Integer,HashMap<Integer,String>>> entrys=map.entrySet();
		for(Map.Entry<Integer,HashMap<Integer,String>> entry:entrys) {
			Integer row=entry.getKey();
			HashMap<Integer,String> map3=entry.getValue();
			Set<Map.Entry<Integer,String> > entrys2=map3.entrySet();
			for(Map.Entry<Integer,String> entry2:entrys2) {
				Integer column =entry2.getKey();
				String value=entry2.getValue();
				System.out.println("行："+row+" 列："+column +" 值："+value);
				
			}
		}

}
}