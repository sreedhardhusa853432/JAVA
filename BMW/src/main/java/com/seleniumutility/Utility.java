package com.seleniumutility;
	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

		public class Utility {
		 WebDriver driver;
			public  Utility(WebDriver driver) 
			{
				this.driver =driver;
		}
		 	public void Takessnapshot(String path1) throws IOException{
		 		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 		try {
		 		 // now copy the  screenshot to desired location using copyFile //method
		 		FileUtils.copyFile(src, new File("C:\\Users\\neomu\\eclipse-workspace\\BMW\\Screenshot"));
		 		}
		 		 
		 		catch (IOException e)
		 		 {
		 		  System.out.println(e.getMessage());
		 		 
		 		 }
		 		 }
		 	}
		
