package actionsClass_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1_study {

	public static void main(String[] args) throws InterruptedException 
	{
         System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
	       
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	     driver.manage().window().maximize();
	     Thread.sleep(200);
	    
	     //move to element using mouse actions
	   Actions act = new Actions(driver);
	   WebElement myelement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	   act.moveToElement(myelement).perform();
	   
	   //click using mouse actions
	   WebElement textelement = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//a[text()=' BANK ']\"))"));
	   
	   //1st way
	   act.moveToElement(textelement).perform();
       act.click().perform();
       
       //2nd way
       //when we perform multiple actions then we use build().perform():
       act.moveToElement(textelement).click().build().perform();
       
       //3rd way
       act.click(textelement).perform();
       
       //right click --->context click
       //act.moveToElement(textelement).contextClick().build().perform();
       
       act.contextClick(textelement).perform();
	}

}
