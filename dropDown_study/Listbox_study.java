package dropDown_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_study {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
	
	       WebDriver fd= new ChromeDriver();
	       
	       fd.get("https://www.facebook.com/");
	       
	       fd.manage().window().maximize();
	       
	       Thread.sleep(200);
	       
	       fd.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
	       Thread.sleep(4000);
	       
	       //1. identify list box to be handled and store it in reference variable
	       
	      WebElement day = fd.findElement(By.name("birthday_day"));
	      
	      //2.  create an object of select class which will accept webElement as argument
	      
	   // Select s = new Select(day);
	      Select s =new Select(day);
	    
	    //3.  by using one of the select class method we can select values form list box like
	    //i . selectByVisibletext:selectByVisibleText(string arg0)
	    //ii.  selectByIndex:selectByIndex(int arg0)
	    //iii.  selectByValue:selectByValue(string arg0)
	    Thread.sleep(1000);
	    s.selectByVisibleText("8");
	    Thread.sleep(1500);
	    s.selectByIndex(9);
	    Thread.sleep(1000);
	    s.selectByValue("15");
	    
	    //1.
	    WebElement month = fd.findElement(By.id("month"));
	    //2.
	    Select s2=new Select(month);
	    
	    s2.selectByIndex(5);
	    Thread.sleep(1200);
	    s2.selectByValue("9");
	    Thread.sleep(1200);
	    s2.selectByVisibleText("Dec");
	    
	}

}
