package miscelleneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findbroken_links {

	public static void main(String[] args) 
	{
         System.setProperty("webdriver.chrome.driver", "D:\\class\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.tutorialsninja.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
	}

}
