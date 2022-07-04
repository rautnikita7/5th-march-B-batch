package kitetest_testNG_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_fox_use {

	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			
		
	}

}
