package selenium_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_ex2 {

	public static void main(String[] args) 
	{
	    System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.findElement(By.name("login")).click();
	
	}

}
