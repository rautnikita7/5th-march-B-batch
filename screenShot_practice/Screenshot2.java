package screenShot_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver fd = new ChromeDriver();
		
		fd.get("https://demoqa.com/select-menu");//open url
		fd.manage().window().maximize();
		Thread.sleep(100);
		
		//to take screenshot using selenium webdriver, we need to type cast driver object to take screenshot interface
		//((takescreenshot).driver)
		//then we need call function getscreenshotAs(); and there we need to pass the argument
		//outputtype.file---->this method will return object of type file
		
	    File source = ((TakesScreenshot)fd).getScreenshotAs(OutputType.FILE);
	    
	    File destination = new File("D:\\screenshotpractice\\myfirstscreenshot.png");
          
	    FileHandler.copy(source, destination);
		}

}
