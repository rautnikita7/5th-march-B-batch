package scrolling_study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrolling_view {

	public static void main(String[] args) throws IOException 
	{
      System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        
        WebElement buttonclick = driver.findElement(By.id("hide-textbox"));
        
        JavascriptExecutor j = ((JavascriptExecutor)driver);
        j.executeScript("arguments[0].scrollIntoView(true);", buttonclick);
        //use screenshot
        File vtct = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination = new File("E:\\Ddisk file\\Pictures\\Screenshots\\practiceSS\\SSvtctt2.png");
	    FileHandler.copy(vtct, destination);
	
	}

}
