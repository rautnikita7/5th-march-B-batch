package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_study {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
	
	    WebDriver gh = new ChromeDriver();
	    
	    gh.manage().window().maximize();
	    
	    gh.get("https://vctcpune.com/selenium/practice.html");
	    
	    Thread.sleep(1000);
	    
      WebElement checkbox = gh.findElement(By.id("checkBoxOption1"));
      
      if(checkbox.isSelected())
      {
    	  System.out.println("checkbox is successfully selected");
      }
      else 
      {
    	  System.out.println(" selecting checkbox now");
    	  
    	  checkbox.click();
    	  
    	  if(checkbox.isSelected())
    	  {
    		  System.out.println("checkbox is selected now");
    		  
    		  
    	  }
    	  else 
    	  {
    		  System.out.println("failed to select check box");
    	  }
    	  
      }
       
	}
}