package iFrame_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_practice {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver tc = new ChromeDriver();
		 
		 tc.get("https://vctcpune.com/selenium/practice.html");
         
		 tc.manage().window().maximize();
         Thread.sleep(1000);
		 //switch selenium focus from main page to frame
         
         tc.switchTo().frame("iframe-name");
         Thread.sleep(2000);
         
         //current focus is on frame now
		 tc.findElement(By.xpath("(//a[text()='About us'])[1]")).click();// this element is present on iframe (need to switch selenium foucs from main page to frame)
		 Thread.sleep(3000);
		 
		 //to take action on main page again, so we need to switch selenium foucs from to main page
		 //parentframe();default content();
		 
		 tc.switchTo().defaultContent();// switching selenium foucs to main page
		 
		 tc.findElement(By.id("checkBoxOption1")).click();
		 
	}

}
