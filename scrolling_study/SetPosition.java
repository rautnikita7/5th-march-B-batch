package scrolling_study;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
     System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
       driver.get("https://www.flipkart.com/");
      // driver.manage().window().maximize();
       Thread.sleep(1000);
       
       System.out.println(driver.manage().window().getPosition());
       Thread.sleep(1000);
       
       //to set position --->use point class and create object of point class
       Point p = new Point(170,-400);
       
       driver.manage().window().setPosition(p);
       Thread.sleep(100);
       System.out.println(driver.manage().window().getPosition());
       
	}

}
