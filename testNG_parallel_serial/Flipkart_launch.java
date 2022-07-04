package testNG_parallel_serial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_launch {
  @Test
  public void flipkartpage() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\pdfclass\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
  }
}
