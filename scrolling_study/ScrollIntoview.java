package scrolling_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoview {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        Thread.sleep(100);
        
        
        WebElement hideshow = driver.findElement(By.id("hide-textbox"));//Reference variable
        
        JavascriptExecutor j = ((JavascriptExecutor)driver);
        
        j.executeScript("arguments[0].scrollIntoView(true);",hideshow);
        Thread.sleep(1000);
        hideshow.click();
	}

}
