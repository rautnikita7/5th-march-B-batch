package miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements_unorderedList {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.findElement(By.name("q")).sendKeys("honda");
		 List<WebElement> searchresult = driver.findElements(By.xpath("(//li[@class='sbct'])[2]"));
         //use for each loop
		 for( WebElement search:searchresult)
		 {
			 System.out.println(search.getText());
			 
		 }
		    String exectedresult = "honda amaze";
		    
		 for(WebElement results:searchresult)
		 {
			String actualresult = results.getText(); 
			
			if(actualresult.equals(exectedresult)) 
			{                      // means actualresult ani expectedresult same asel tr result la click kr
				
				results.click();//results .click ka ghetl karn ithe aplyala element la click kraych ahe string la nhi ani ithe results ha element ahe
				break;
			}
		 }
		 
	}

}
