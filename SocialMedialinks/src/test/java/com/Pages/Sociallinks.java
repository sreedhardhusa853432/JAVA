package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.Library;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	public class Sociallinks{
		private WebDriver driver;
		public Sociallinks(WebDriver driver) {
			this.driver=driver;
		}

		//To find no of links present on the webpage
				public int count() {
				List<WebElement> l=driver.findElements(By.tagName("a"));
				int count=l.size();
				return count;
			}
			
			public String links() {
				List<WebElement> link=driver.findElements(By.tagName("a"));
				List<WebElement> href=driver.findElements(By.tagName("href"));
				for(int i=0; i<href.size();i++) {
					String s=link.get(i).getAttribute("href");
					System.out.println(s);
				}
				return null;
			}
			// to check if facebook, google plus and twitter links are present
			public int social() {
				List<WebElement> soc=driver.findElements(By.tagName("form"));
				for(WebElement s:soc) {
					System.out.println(s.getAttribute("action"));
					
				if(s.getAttribute("action").contains("https://www.facebook.com/travelbusiness/")) {
					Assert.assertTrue(true);
					System.out.println("facebook is present");
					if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/ul[2]/li[3]/form/button/i")).isDisplayed()) 
					{
					     driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/ul[2]/li[3]/form/button/i")).click();
					     driver.getTitle();
					     String title=driver.getTitle();
					     System.out.println(title);
					     if(title.contains("https://www.twitter.com/phptravels?"))
					    	 Assert.assertTrue(true);
							System.out.println("twitter is present");
					}
			
				if(s.getAttribute("action").contains("https://www.googleplus.com/phptravels?")) {
					Assert.assertTrue(true);
					System.out.println("google plus is present");
				}
				else {
					Assert.assertFalse(false);
					System.out.println("google plus link not found");
				}
	            break;
				}
			}
			    return 0;
			}
	}
