package com.seleniumutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Library;

public class seleniumutility
{
WebDriver driver;
public seleniumutility(WebDriver driver)
{
this.driver=driver;
}
public void takeSnapShot(String path1)
{
TakesScreenshot ts=(TakesScreenshot)driver;
File Source=ts.getScreenshotAs(OutputType.FILE);

try
{
FileUtils.copyFile(Source, new File("C:\\Users\\durga\\eclipse-workspace\\SocialMedialinks\\Screenshots\\phphome.png"));
}
catch (IOException e)
{
e.printStackTrace();
}
}
}
