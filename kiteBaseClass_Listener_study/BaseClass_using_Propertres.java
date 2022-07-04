package kiteBaseClass_Listener_study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.Utility_properties_study;

public class BaseClass_using_Propertres
{
	
	 protected static WebDriver driver;
	//browser setup
	
	public void openBrowser() throws IOException
	{
			
		System.setProperty("webdriver.chrome.driver" ,"D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_properties_study.readDataFromProprty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	public  void takeScreenshot(String TCName) throws IOException
		{
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      File dest= new File("D:\\SCREENSHOT prctice\\SS2"+TCName+".png");
	      FileHandler.copy(src, dest);
		  
		}

   
}

