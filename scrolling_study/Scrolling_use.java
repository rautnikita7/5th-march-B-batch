package scrolling_study;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_use {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://vctcpune.com/");
       // driver.manage().window().maximize();
        
        JavascriptExecutor j = ((JavascriptExecutor)driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        // +ve x value--> right hand side, Y value +ve --> down (+x,+y)
		// +ve x value--> right hand side, Y value -ve --> up (+x,-y)
		// -ve x value--> left hand side, Y value +ve --> down(-x,+y) 
		// -ve x value--> left hand side, Y value -ve -->up(-x,-y)
        
        j.executeScript("window.scrollBy(80,900)");
        Thread.sleep(2000);
        j.executeScript("window.scrollBy(90,900)");
        Thread.sleep(2000);
        j.executeScript("window.scrollBy(-90,900)");
        Thread.sleep(2000);
        j.executeScript("window.scrollBy(-90,-900)");
        Thread.sleep(2000);
	}

}
