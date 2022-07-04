package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_study {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver gb = new ChromeDriver();
		  
		  gb.manage().window().maximize();
		  
		  gb.get("https://www.discoveryplus.in/");
		  
		  Thread.sleep(2000);
		  
		  gb.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		  
		  Thread.sleep(100);
		   
		 WebElement otpbutton = gb.findElement(By.xpath("//button[@type='submit']"));   //apan =chya adhi webelement otpbutton ha asa refrance variable mahun ghetla tya mule te as aal
		 
		boolean result = otpbutton.isEnabled();
		
		System.out.println("otp button is "+result);
		
		
	}
	

}
