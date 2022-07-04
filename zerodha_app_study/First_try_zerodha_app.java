package zerodha_app_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_try_zerodha_app {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\pdfclass\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 
		 userName.sendKeys("ELR321");
		 password.sendKeys("Dhana1111");
		 loginButton.click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		WebElement pin = driver.findElement(By.id("pin"));
		 WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 
		pin.sendKeys("982278");
		continueButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
		 String actualuserid = userId.getText();
		 
		 String expecteduserid = "ELR321";
		 if(actualuserid.equals(expecteduserid))
		 {
			 System.out.println("user id is match tc is pass");
		 }
		
		 else
		 {
			System.out.println("user id is not matching tc is faild"); 
		 }
		 
		 userId.click();
	     Thread.sleep(100);
	    WebElement loginbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		loginbutton.click();
		Thread.sleep(200);
		driver.close();
		
		
		
	
	}

	

}
