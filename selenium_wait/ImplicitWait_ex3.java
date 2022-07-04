package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_ex3 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.discoveryplus.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
	}

}
