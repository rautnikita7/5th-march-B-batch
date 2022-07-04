package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_study {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Element1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		System.out.println(Element1.getText());
		
		String actualText = Element1.getText();
		
		String expextedtext="facebook helps you connect and share with the people in your life.";
		
		if(actualText.equals(expextedtext))
		{
		System.out.println("Text is matching and TC is passed");
		}
		else 
		{
		System.out.println("Text is not matching and TC is failed");
		}
		
	} 

}