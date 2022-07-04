package popups_study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_popups_study {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://skpatro.github.io/demo/links/");//open 1st window means main page
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.name("NewWindow")).click();//open 2nd new window means child window
        Thread.sleep(100);
        
        String Idofmainpage = driver.getWindowHandle();// he aapn fkt pahnya sathi use kel ki gethandle work kse krte
        System.out.println(" main page id "+Idofmainpage);
        
        //all ids are recived in set
          Set<String> allids = driver.getWindowHandles();
          
          //set need to convert into arraylist
          ArrayList<String> ar = new ArrayList<>(allids);
          
          for(int i=0; i<=ar.size()-1; i++)
          {
        	  System.out.println(ar.get(i));
          }
          
             String mainpage = ar.get(0);
             String childpage = ar.get(1);
             
             //switch to child page
             
             driver.switchTo().window(childpage);//here selenium focus switched to child page
             Thread.sleep(200);
             
             driver.manage().window().maximize();
            driver.findElement(By.id("the7-search")).sendKeys("selenium");
           // driver.findElement(null)
             driver.findElement(By.xpath("(//span[text()='Selenium'])[1])"));
             //driver.close();//use to close current tab open by selenium
             
             driver.switchTo().window(mainpage);//switching selenium focus child page to main page
             //driver.switchTo().window(ar.get(0));//he ani 51 line code samech ahe ya don type ne aapn kru shkto 
             driver.findElement(By.name("NewTab")).click();
             
	}

}

