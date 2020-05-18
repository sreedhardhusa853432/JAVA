package com.testcases;
	import java.io.IOException;

import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.Sociallinks;
import com.seleniumutility.seleniumutility;

	public class Testphp  extends  Library{
		Sociallinks php;
		seleniumutility util;
		@BeforeMethod
		public void beforeMethod() throws IOException{
			Select_Browser_and_launch();
			php=new Sociallinks(driver);
		}
		@Test
		public void links() {
			int c=php.count();
			Assert.assertTrue(c>100);
			System.out.println("more than 100 links are present");
		}
		@Test
		public void present() {
			int a=php.social();
		}
			@AfterMethod
				 public void takes_a_screenshot() throws IOException {
				seleniumutility util=new  seleniumutility(driver);
					 util.takeSnapShot("C:\\Users\\durga\\eclipse-workspace\\SocialMedialinks\\Screenshots\\phphome.png");
					 System.out.println("takes a Screenshot");
					 driver.quit();
					 }
		
	}

