package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudyEx2 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
	      
	     WebDriver  f = new ChromeDriver();
	     
	     f.manage().window().maximize();
	     
	     f.get("https://www.facebook.com/");
	     
	     Thread.sleep(1500);
	     
	     f.findElement(By.xpath("//input[@name='email']")).sendKeys("Nikita Raut");
	     
	     Thread.sleep(1000);
	     
	     f.findElement(By.xpath("//input[@name='email']")).clear();
	     
	    WebElement UserName = f.findElement(By.xpath("//input[@name='email']"));
	    
	    UserName.sendKeys("1234456");
	    
	    UserName.clear();
	    
	    WebElement password = f.findElement(By.xpath("//input[@name='pass']"));
	    
	    f.findElement(By.xpath("//button[@name='login'] ")).click() ; 
	}

}
