package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_study {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
      
      WebDriver dt= new ChromeDriver();
      
      dt.manage().window().maximize();
      
      dt.get("https://vctcpune.com/selenium/practice.html");
      
      Thread.sleep(100);
      
      WebElement textbox = dt.findElement(By.id("displayed-text"));
      
      boolean result = textbox.isDisplayed();
      
      System.out.println("textbox is "+result);
      
      textbox.sendKeys("hlw how are you");
      
      dt.findElement(By.id("hide-textbox")).click();
      
      boolean result1 = textbox.isDisplayed();
      System.out.println("textbox is "+result1);
      
	}

}
