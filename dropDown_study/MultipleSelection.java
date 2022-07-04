package dropDown_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demoqa.com/select-menu");
        
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        
       WebElement dropDownbox = driver.findElement(By.name("cars"));
       
       //1.create object of select class
       
       Select s = new Select(dropDownbox);
       //2. check is multiple
       
       boolean result = s.isMultiple();
       
       System.out.println("multiple result is "+result);
        
       s.selectByIndex(0);
       Thread.sleep(200);
       s.selectByIndex(1);
       Thread.sleep(200);
       s.selectByIndex(2);
       Thread.sleep(500);
       
       //how to de-select
       
       //s.deselectAll(); note - we can use deselect only when we use multiple selectable
       
       s.deselectByVisibleText("Volvo");
       
       System.out.println(s.getFirstSelectedOption().getText());
       
       WebElement firstwebelement = s.getFirstSelectedOption();
       
       String mytext = firstwebelement.getText();
       
      System.out.println("1st selected option is "+mytext);
      
      System.out.println(s.getAllSelectedOptions().size());
      
      for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
    	  
      {
    	  System.out.println(s.getAllSelectedOptions().get(i).getText());
      }
      
      
       
       
	}

}
