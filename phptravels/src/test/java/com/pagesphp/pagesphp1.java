package com.pagesphp;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class pagesphp1 {
		WebDriver driver;

		@FindBy(id = "dropdownCurrency")
		WebElement currency;

		@FindBy (xpath = "//div[@class='dropdown dropdown-currency show']//a[4]")
		WebElement euros;

		@FindBy (xpath = "//a[contains(text(),'Flights')]")
		WebElement flights;

		@FindBy (id = "s2id_location_from")
		WebElement from;

		@FindBy (xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div[3]/div[1]/div/div[1]/div/div[2]/div/a/span[1]")
		WebElement fromadd;

		@FindBy (id = "s2id_location_to")
		WebElement to;

		@FindBy (xpath = "//body/div/ul/li[4]")
		WebElement toadd;

		@FindBy(name = "departure_date")
		WebElement date;

		@FindBy (xpath = "//div[8]//div[1]//div[1]//div[2]//div[30]")
		WebElement day;

		@FindBy (xpath = "//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")
		WebElement adult;

		@FindBy (xpath = "//*[@id=\"flights\"]/div/div/form/div/div[3]/div[4]/button")
		WebElement search;

		@FindBy (xpath = "//strong[contains(text(),'EUR 19')]")
		WebElement price;

		public pagesphp1(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
		}
		public void Select_currency() {
		currency.click();
		}
		public void Select_Euros() {
		euros.click();
		}
		public void Select_flights() {
		flights.click();
		}
		public void Select_from() {
			try {
		Actions action = new Actions(driver);
		action.moveToElement(from).click().sendKeys("los angeles");
		action.build().perform();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div[3]/div[1]/div/div[1]/div/div[2]/div/a/span[1]"))));
		fromadd.click();
		}
			catch(StaleElementReferenceException e) {
				Actions action = new Actions(driver);
				action.moveToElement(from).click().sendKeys("los angeles");
				//fromadd.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		public void Select_to() {
			WebDriverWait wait=new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("s2id_location_to"))));
		Actions action = new Actions(driver);
		action.moveToElement(to).click().sendKeys("Dallas");
	//	action.build().perform();

		//toadd.click();
		}
	/*	public void Select_date() throws Throwable{
		date.click();
		}
		public void Select_Day() throws Throwable{
		//day = driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]//div[30]"));
		//Actions action = new Actions(driver);
		//action.moveToElement(day).click();
		//action.build().perform();
		day.click();

		}
		public void Select_Adult()throws Throwable {
		adult.click();
		Thread.sleep(3000);
		adult.click();
		}
		public void Select_search() {
		search.click();
		}
		public void Select_price() {
		//price.getText();
		String p = price.getText();
		String p1 = p.substring(4, 6);
		System.out.println(p1);
		int i = Integer.parseInt(p1);
		if(i>100&i<250) {
		Assert.assertTrue(true);
		System.out.println("price is greater than 100 euros and less than 250 euros");

		}else {
		Assert.assertTrue(true);
		System.out.println("price is = "+p1+" euros");
		}*/
}
