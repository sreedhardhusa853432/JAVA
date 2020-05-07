package com.pages;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Baseclass.Library;

public class Bmwclass extends Library {
		int i;
		By Models = By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/div[1]/a/span[2]");
		By seven=By.xpath("//*[@id=\'pad2\']/nav/div/ul/li[4]/a");
		By image = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]");
		By technicaldata = By.xpath("/html/body/div[5]/main/div[1]/div[5]/div/div/div/div/div/div[4]/nav/div/div[3]/a");		
		By horsepower = By.xpath("//*[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[1]/div/table/tbody/tr[4]/td[2]/div");
		public Bmwclass(WebDriver driver)
		{
this.driver=driver;		}
		
	public void Model()
		{
			driver.findElement(Models).click();
			System.out.println("ModelNumber is Clicked");
		}
		
	public void link()
	{
		driver.findElement(seven).click();
		System.out.println("7 is Clicked");
	}
	
	
		public void image()
		{
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(image));
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'ds2-model-card--image')]//a"))).build().perform();
		driver.findElement(image).click();
			System.out.println("Image is Clicked");
		}
		public void technicaldata()
		{
			driver.findElement(technicaldata).click();
		}
	/*	public void speed()
		{
			String b = driver.findElement(horsepower).getText();
			System.out.println(b);
			System.out.println(b.length());
			System.out.println(b.substring(5, 8));
			
			 i = Integer.parseInt(b.substring(5, 8));
			System.out.println(i);
			System.out.println("HorsePower is Displayed");

		}
		public void condition() 
		{
			if(i<500)
			{
				File file = new File("C:\\Users\\lenovo\\eclipse-workspace4\\BMWProject\\Output.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook();
				XSSFSheet sh = wb.createSheet("First Sheet");
				sh.createRow(0).createCell(0).setCellValue("Does not meet my Requirements");
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					wb.write(fos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else
			{
				Assert.assertTrue(true, "Meet my requirements");
			}
		}
		
*/

	}
