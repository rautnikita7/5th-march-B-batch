package scrolling_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView_ex2 {

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        
        WebElement searchbutton = driver.findElement(By.id("//a[text()='Sign in securely']']"));//reference veriable
        
        JavascriptExecutor j = ((JavascriptExecutor)driver);
        
        j.executeScript("arguments[0].scrollIntoView(true);",searchbutton);
	}
}
