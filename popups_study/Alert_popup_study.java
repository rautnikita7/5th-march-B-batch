package popups_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_study {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver fd = new ChromeDriver();
		
		fd.get("https://demoqa.com/alerts");
		fd.manage().window().maximize();
		Thread.sleep(100);
		
		fd.findElement(By.id("alertButton")).click();
		Thread.sleep(200);
		
	    Alert alt = fd.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(1000);
		
		fd.findElement(By.id("timerAlertButton")).click();
		 Alert alt2 = fd.switchTo().alert();
		 alt2.accept();
		
	}

}
