package scrolling_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS2 {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

}
