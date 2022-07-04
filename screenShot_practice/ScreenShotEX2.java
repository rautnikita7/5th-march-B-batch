package screenShot_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEX2 {

	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(200);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File destination = new File("D:\\screenshotpractice\\myfirstscreenshot.png");
        
	    FileHandler.copy(source, destination);
	}

}
