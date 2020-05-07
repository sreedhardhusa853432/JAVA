package com.Baseclass;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Library {
		public  WebDriver driver;
		FileInputStream fis;
		Properties prop;
			public void launchApp() throws IOException  {
				 fis=new FileInputStream("C:\\Users\\neomu\\git\\JAVA\\BMW\\configurationproperty\\config.property");
				prop=new Properties();
				prop.load(fis);
				String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\neomu\\git\\JAVA\\BMW\\Drivers\\chromedriver.exe");
				 driver = new ChromeDriver();
			//	driver = new FirefoxDriver();
			System.out.println("Chrome Browser is launched");
			  driver.get(url);
			//driver.get("https://opensource-demo.orangehrmlive.com");
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   System.out.println("BMW is launched");

				 if (driver.getTitle().equals("Your Store"))
			     {
			            System.out.println("Verification Successful - The correct title is displayed on the web page and it is displaying search box");
			     }
			     else
			     {
			            System.out.println("Verification Failed - An incorrect title is displayed on the web page and it's not displaying search box.");
			     }
			}
			
		}


