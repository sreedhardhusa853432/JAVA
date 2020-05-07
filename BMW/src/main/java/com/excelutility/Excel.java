package com.excelutility;
	import java.io.File;
	import java.io.FileInputStream;
		import java.io.IOException;

		import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;

	public class Excel extends Library{
			public Excel (WebDriver driver)  {
				this.driver=driver;
			}
			public String excel_username(int a) throws IOException {
			 
			    FileInputStream fil = new FileInputStream(new File("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Testdata\\Demo_opencart_project.xlsx"));
			 
			    XSSFWorkbook workbook = new XSSFWorkbook (fil);
			   
			  XSSFSheet sheet= workbook.getSheet("Sheet1");
			   
			   int count = sheet.getLastRowNum();
			 
			    System.out.println(count);
			   
			     XSSFRow row= sheet.getRow(a);
			     
			     XSSFCell cell= row.getCell(0);
			     
			    String un =cell.getStringCellValue();
			     
			   return un;
			    
			   }
			
			public String excel_password(int b) throws IOException {
				 
			    FileInputStream fil = new FileInputStream(new File("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Testdata\\Demo_opencart_project.xlsx"));
			 
			    XSSFWorkbook workbook = new XSSFWorkbook (fil);
			   
			  XSSFSheet sheet= workbook.getSheet("Sheet1");
			   
			   int count = sheet.getLastRowNum();
			 
			    System.out.println(count);
			   
			     XSSFRow row= sheet.getRow(b);
			     
			     XSSFCell cell1= row.getCell(1);
			     
			    String pwd =cell1.getStringCellValue();
			     
			   return pwd;
			    
			   }
			

			}
