package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey_Study {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","D:\\class\\chromedriver_win32\\chromedriver.exe");
	    
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.get("https://www.facebook.com/");
	
	    Thread.sleep(200);
	     
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Nikita Raut");
	    
	    
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12567");
	    
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}
//button[@name='login
	
	

}
