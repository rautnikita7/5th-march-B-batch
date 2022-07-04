package kiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility_properties_study
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      String random=RandomString.make(3);
      File dest= new File("D:\\SCREENSHOT prctice\\SS2"+random+".png");
       FileHandler.copy(src, dest);
	  
	}
	public static String readDataFromProprty(String key) throws IOException
	{
	    Properties prop= new Properties();
	    FileInputStream myprop= new 
	    FileInputStream("E:\\desktop\\Desktop\\New folder\\eclipse-workspace\\.metadata\\.plugins\\Maven_projects\\Maven.properties");
	    prop.load(myprop);
	    String value = prop.getProperty(key);
	    return value;
	}
	public static void implicitWait(WebDriver driver,int timeUnit)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
		
		
		
}


