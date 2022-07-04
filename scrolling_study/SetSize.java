package scrolling_study;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
       driver.get("https://www.flipkart.com/");
       driver.manage().window().maximize();
       Thread.sleep(1000);
       
       System.out.println(driver.manage().window().getSize());
       Thread.sleep(100);
       
       Dimension d = new Dimension(200,300);
       //driver.manage().window().setSize(d);
       
       System.out.println(driver.manage().window().getSize());
       
       

	}

}
