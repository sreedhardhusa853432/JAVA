package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
public WebDriver driver;
public Properties prop;


public void Select_Browser_and_launch() throws IOException
{
FileInputStream file= new FileInputStream("C:\\Users\\durga\\eclipse-workspace\\demo\\configurationproperty\\config.property");
prop=new Properties();
prop.load(file);

//To check the availability of the browser
if(prop.getProperty("browser").equals("chrome"))
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\durga\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
}
else if(prop.getProperty("browser").equals("FireFox"))
{
System.setProperty("webdriver.gecko.driver", "C:\\Users\\durga\\eclipse-workspace\\SocialMedialinks\\Drivers\\geckodriver.exe");
driver=new FirefoxDriver();
}
else
{
System.out.println("Selected Browser is not available");
}

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));

}

//To close the application
public void quit()
{
 driver.close();
}
}
