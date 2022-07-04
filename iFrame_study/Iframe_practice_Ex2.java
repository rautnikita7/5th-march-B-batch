package iFrame_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_practice_Ex2 {

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver Ac = new ChromeDriver();
		 
         Ac.get("https://demoqa.com/nestedframes");
         Ac.manage().window().maximize();
         Thread.sleep(1000);
         
         //Step1---swtich selenium foucs from main page to frame
         Ac.switchTo().frame("frame1");
         Thread.sleep(1500);
         
         //step2-----switch selenium foucs from parent frame to child frame
         WebElement childframe = Ac.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
         Ac.switchTo().frame(childframe);
         Thread.sleep(1600);
         
         //step2----->switch selenium foucs from parent frame to child frame
         WebElement frame1 = Ac.findElement(By.xpath("//p[text()='Child Iframe']"));
         String result = frame1.getText();
         System.out.println(result);
         Thread.sleep(1500);
         
         //step3--->switch selenium focus from 
         Ac.switchTo().parentFrame();
         WebElement parentframe = Ac.findElement(By.xpath("//body[text()='Parent frame']"));
         String result2 = parentframe.getText();
         System.out.println(result2);
         Thread.sleep(1500);
         
         Ac.switchTo().defaultContent();
         WebElement MAINPAGE = Ac.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe')]"));
         String result3 = MAINPAGE.getText();
         System.out.println(result3);
         
         
	}
}
