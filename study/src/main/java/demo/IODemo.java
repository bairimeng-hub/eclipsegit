package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IODemo {

	public static void main(String[] args) throws Exception {
		InputStream inStream=new FileInputStream("C:\\Users\\ChenLong\\Desktop\\a.xlsx");
		OutputStream outputStream=new FileOutputStream("C:\\Users\\ChenLong\\Desktop\\b.xlsx");
//		int len=0;
//		byte[] b=new byte[1024];
//		while((len= inStream.read(b))!= -1){
//			outputStream.write(b,0,len);			
//		}
//		outputStream.close();
//		inStream.close();
		XSSFWorkbook wb =new XSSFWorkbook(inStream);
		XSSFSheet sheet=wb.getSheetAt(1);
		FileReader er=new FileReader("C:\\Users\\ChenLong\\Desktop\\a.txt");
		char[] chars=new char[1024];
		er.read(chars);
		System.out.println(new String(chars));
		
}
}