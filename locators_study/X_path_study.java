package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(900);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		//driver.findElement(By.xpath("//h2[@class='_8eso']")).click();
		
		
	}


}
