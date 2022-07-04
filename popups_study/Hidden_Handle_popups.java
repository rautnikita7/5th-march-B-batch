package popups_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Handle_popups {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver fd = new ChromeDriver();
		
		fd.get("https://www.flipkart.com/");
		fd.manage().window().maximize();
		Thread.sleep(100);
		
		fd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(150);
		
		fd.findElement(By.name("q")).sendKeys("noise smartwatches");
        fd.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
