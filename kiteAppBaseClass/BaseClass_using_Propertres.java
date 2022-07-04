package kiteAppBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppUtility.Utility_properties_study;

public class BaseClass_using_Propertres
{
	
	protected WebDriver driver;
	//browser setup
	
	public void openBrowser() throws IOException
	{
			
		System.setProperty("webdriver.chrome.driver" ,"D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_properties_study.readDataFromProprty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

   
}

