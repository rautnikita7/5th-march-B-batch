package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledEX2 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver fd = new ChromeDriver();
        
        fd.manage().window().maximize();
        
        fd.get("https://www.swiggy.com/?");
        
        Thread.sleep(100);
        
        fd.findElement(By.xpath("//a[text()='Sign up']")).click();
        
        Thread.sleep(500);
         
        WebElement button = fd.findElement(By.xpath("//input[@name='mobile']"));
        
        boolean result = button.isEnabled();
        
        System.out.println("button is "+result);
        
        fd.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9970694565");
        
        Thread.sleep(700);
        
        boolean result1 = button.isEnabled();
        
        System.out.println("button is "+result1 );
        
        
        
        
	}

}
