package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args)
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.discoveryplus.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[1]")).click();
	}

}