package miscelleneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart_review_HW {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofHours(1000));
		 driver.findElement(By.name("q")).sendKeys("one plus 10r");
		
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 WebElement searchbutton = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
          searchbutton.click();
          
          driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         WebElement reviewResult = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
         System.out.println(reviewResult.getText());
         
         
	
	
	}

}
