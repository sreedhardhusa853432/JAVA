package com.pagesphp;
	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Libraryphp;


public class pagesphp extends Libraryphp{
		Logger LOG=Logger.getLogger(pagesphp.class.getName());
		By usd = By.xpath("//*[@id=\'dropdownCurrency\']");
		By eur = By.xpath("//*[@id=\'header-waypoint-sticky\']/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[4]");
		By flights=By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a");
		By from=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
		By search=By.id("s2id_location_from");
		By searchfrom=By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div[3]/div[1]/div/div[1]/div/div[2]/div/a/span[1]");
		By virat=By.id("s2id_location_to");
		By date=By.name("departure_date");
		By day=By.xpath("//div[8]//div[1]//div[1]//div[2]//div[32]");
		By adult=By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]");
		public  pagesphp(WebDriver driver) 
		{
			this.driver =driver;
		}
		public void currency()
		{
			driver.findElement(usd).click();
		}
		public void Eur() {
			driver.findElement(eur).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	/*	public void From() {
			try {
			WebDriverWait wait=new WebDriverWait(driver,100);
			WebElement location=wait.until(ExpectedConditions.elementToBeClickable(By.id("s2id_location_from")));
			location.click();
			
		}
		catch(ElementNotInteractableException e) {
			WebElement	location10=driver.findElement(By.id("s2id_location_from"));
			location10.click();
		}
		}*/
		public void searchfrom(String name) {
			/*	WebDriverWait wait=new WebDriverWait(driver,10);
				//WebElement location100=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select2-container form-control select2-dropdown-open select2-container-active']")));
				//location100.sendKeys(los);
				Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[@class='select2-container form-control select2-dropdown-open select2-container-active']"))).build().perform();
		WebElement location100=	driver.findElement(By.xpath("//div[@class='select2-container form-control select2-dropdown-open select2-container-active']"));
			location100.sendKeys(los);
			*/
			  Actions actions = new Actions(driver);
			  actions.click(driver.findElement (search)).sendKeys(name).perform();
			  WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div[3]/div[1]/div/div[1]/div/div[2]/div/a/span[1]"));
			  Actions actions1 = new Actions(driver);
			  actions1.moveToElement(element).click().build().perform();
			 // driver.findElement(searchfrom).click();
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void To(String name2) {
			//  Actions actions1 = new Actions(driver);
			//  actions1.click(driver.findElement (search1)).sendKeys(name2).perform();
			Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(virat));
		action.click().sendKeys(name2);	
		action.build().perform();
		}
			public void Date() throws Throwable{
				 WebElement element1 = driver.findElement(By.name("departure_date"));
				  Actions actions1 = new Actions(driver);
				  actions1.moveToElement(element1).click().build().perform();
				driver.findElement(date).click();
			}
			public void Day() throws Throwable {
				WebElement element2 = driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]//div[32]"));
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(day));
					//WebDriverWait wait=new WebDriverWait(driver,15);
				//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(day)));
				
				 driver.findElement(day).click();
				// action.build().perform();
			//	WebDriverWait wait=new WebDriverWait(driver,10);
			//	WebElement day=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\'datepickers-container\\']/div[8]/div/div/div[2]/div[19]")));
			//(day).click();
			}
		/*	public void Adult()throws Throwable {
				driver.findElement(adult).click();
			//	Thread.sleep(3000);
				//adult.click();
				}*/
			
}


