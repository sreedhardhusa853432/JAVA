package com.pages1;
	import java.util.List;

import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
	public class pages1 {
		Logger LOG=Logger.getLogger(pages1.class.getName());
			WebDriver driver;
			By search = By.id("search");
			By logo =By.name("submit-search");
			By featured = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div/div/div[3]/div/div[2]/div[1]/div[1]/a[2]");
			By high = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div/div/div[3]/div/div[2]/div[1]/div[1]/ul/li[5]/a");
			By tuxedo=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/ul[1]/li[1]/div[4]/div[3]/p[1]");
			By size=By.xpath("//*[@id=\'size-dropdown\']");
			By Range=By.xpath("//option[contains(text(),'36S 29')]");
		By quantity=By.xpath("//p[contains(text(),'+')]");
			By Addtocart=By.xpath("//input[@id='addtobagID']");
		public  pages1(WebDriver driver) 
			{
				this.driver =driver;
			}
		
			public void Search(String userid) 
			{
				driver.findElement(search).sendKeys(userid);
				LOG.info("entered name in the username field");
			}
			public void  Logo() {
				driver.findElement(logo).click();
				LOG.info("clicked logo");
				
			}
			
			public void Featured()
			{
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(featured)));
				WebElement feature=driver.findElement(featured);
				feature.click();
				//LOG.info("entered password in the username field");
				
			}
			public void High() 
			{
				WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(high)));
			WebElement qua=	driver.findElement(high);
					qua.click();
			}
			
			public void Tuxedo() {
			try {
			//	WebDriverWait wait=new WebDriverWait(driver,20);
			//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(tuxedo)));
				WebElement Tux=driver.findElement(tuxedo);
				Tux.click();
				
			}
			
				catch(StaleElementReferenceException e) {
					WebElement Tux=driver.findElement(tuxedo);
					Tux.click();
				}
			}
			
			public void size()
			{
				WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(size)));
				WebElement feature10=driver.findElement(size);
				feature10.click();
				
			}
			public void size1() {
				
				 //  Actions action = new Actions(driver);
			       // action.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).perform();
				//Actions action = new Actions(driver);    
					//WebElement optionsList = driver.findElement(By.xpath("//span[contains(@class, 'k-dropdown-wrap')]"));
					//action.moveToElement(optionsList);

				/*	List<WebElement> options = driver.findElements(By.xpath("//option[contains(text(),'36S 29')]"));
					for(WebElement option : options) {
					    if (option.getText().equals("36S 29")) {
					        option.click();
					    }*/
			//	Select size46 = new Select(feature1);
			//	size46.selectByVisibleText("40R 33");
				//WebDriverWait wait=new WebDriverWait(driver,15);
				//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Range)));
			//	WebElement Size=driver.findElement(Range);
				//Size.click();
				try {
			WebElement Size=driver.findElement(By.xpath("//option[contains(text(),'36S 29')]"));
					Size.click();
				List<WebElement> options = Size.findElements(By.tagName("option"));
				for (WebElement option : options) {
					if("36S 29".equals(option.getText()))
					((WebElement) options).click();
				}
				}
				catch(StaleElementReferenceException e) {
					WebElement Size=driver.findElement(By.xpath("//option[contains(text(),'36S 29')]"));
					Size.click();
				List<WebElement> options = Size.findElements(By.tagName("option"));
				for (WebElement option : options) {
				if("36S 29".equals(option.getText()))
					((WebElement) options).click();
				}
				}
	}
			public void Quantity()
			{
				WebDriverWait wait=new WebDriverWait(driver,15);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(quantity)));
				WebElement feature2=driver.findElement(quantity);
				feature2.click();
				
			}
			public void addtocart()
			{
				try {
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Addtocart)));
				WebElement feature3=driver.findElement(Addtocart);
				feature3.click();
				}
				catch(StaleElementReferenceException e) {
					WebElement Tux=driver.findElement(tuxedo);
					Tux.click();
				}
			}
			public void assertions() {
				WebElement cart=driver.findElement(By.xpath("//*[@id=\\'tr_phase2_ShoppingBg\\']/span[2]"));
				Assert.assertEquals(cart.isDisplayed(), true);
			}
			
		}
