package com.pagesphp;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Libraryphp;

public class phplocation extends Libraryphp{
		Logger LOG=Logger.getLogger(phplocation.class.getName());
		WebDriver driver;
		By flights=By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a");
		By from=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
		public  phplocation(WebDriver driver) 
		{
			this.driver =driver;
		}
		
		public void Flights() {
			WebDriverWait wait=new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(flights)));
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a"))).build().perform();
			driver.findElement(flights).click();
			/*catch(StaleElementReferenceException e) {
				Actions action=new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("//a[@class='text-center flights']"))).build().perform();
				driver.findElement(flights).click();
			}*/
		}
	public void To() {
		WebDriverWait wait=new WebDriverWait(driver,100);
		WebElement location=wait.until(ExpectedConditions.elementToBeClickable(By.id("s2id_location_to")));
		location.click();
	}
	
}
