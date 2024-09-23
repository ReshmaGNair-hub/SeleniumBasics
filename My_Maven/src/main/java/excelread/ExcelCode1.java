package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode1 {
	
public static FileInputStream f;
public static XSSFWorkbook w;
public static XSSFSheet s;
public static XSSFRow r;
public static XSSFCell c;
 
public static String readString(int i , int j) throws IOException {

	f = new FileInputStream("/Users/reshmag/Desktop/Excelread.xlsx");
	w = new XSSFWorkbook(f);
	s= w.getSheet("Sheet1");
	r= s.getRow(i);
	c=r.getCell(j);
	return c.getStringCellValue();
}
public static double readInteger(int i , int j) throws IOException
{
	f = new FileInputStream("/Users/reshmag/Desktop/Excelread.xlsx");
	w = new XSSFWorkbook(f);
	s= w.getSheet("Sheet1");
	r= s.getRow(i);
	c= r.getCell(j);
	return c.getNumericCellValue();
	
	
			
}

}







