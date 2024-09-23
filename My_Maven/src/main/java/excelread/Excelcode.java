package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode {
	//file-wbook--sheet..>row and column
	
	
	//declaring as primitive data type
	public static FileInputStream f;//used to fetch file.It is a class to fetch file
	public static XSSFWorkbook w;//used to fetch workbook
	public static XSSFSheet s;
	public static XSSFRow r;
	public static XSSFCell c;
	
	//used to fetch sheet
	public static String readStringData(int i, int j) throws IOException
	{
		f = new FileInputStream("/Users/reshmag/Desktop/Excelread.xlsx");
		w= new 	XSSFWorkbook(f);//workbook is inside file
		s= w.getSheet("Sheet1");//sheet is inside the workbook
		
		 r =s.getRow(i);//XSSRow is predefined class and it denoted to i and	used to fetchrow.	
		c= r.getCell(j);
	
		return c.getStringCellValue();//it will return the string values of cell
	
		
	}
	public static double readIntegerData(int i , int j) throws IOException
	{
		f = new FileInputStream("/Users/reshmag/Desktop/Excelread.xlsx");
				w= new 	XSSFWorkbook(f);//workbook is inside file
				s= w.getSheet("Sheet1");//sheet is inside the workbook
				XSSFRow r =s.getRow(i);//XSSRow is predefined class and it denoted to i and	used to fetchrow.	
				XSSFCell c= r.getCell(j);
				return c.getNumericCellValue();
	}

	
	}


