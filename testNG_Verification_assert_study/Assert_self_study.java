package testNG_Verification_assert_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert_self_study {
  @Test
  public void launchVCTC()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\pdfclass\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://vctcpune.com/");
      driver.manage().window().maximize();
      
	  
  }
}
