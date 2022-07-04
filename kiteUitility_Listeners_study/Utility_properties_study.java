package kiteUitility_Listeners_study;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utility_properties_study
{
	//public static void takeScreenshot(WebDriver driver) throws IOException
	//{
	 // File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    // String random=RandomString.make(3);
    //File dest= new File("D:\\SCREENSHOT prctice\\SS2"+random+".png");
    //FileHandler.copy(src, dest);
	  
	//}
	public static String readDataFromProprty(String key) throws IOException
	{
	    Properties prop= new Properties();
	    FileInputStream myprop= new 
	    FileInputStream("C:\\Users\\yogendra\\eclipseworkspace\\5th_March_B_Selenuim\\myproperty.properties");
	    prop.load(myprop);
	    String value = prop.getProperty(key);
	    return value;
	}
	public static void implicitWait(WebDriver driver,int timeUnit)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
		
		
		
}


