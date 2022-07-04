package selenium_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "E:\\pdfclass\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
       driver.get("https://vctcpune.com/");
       
       
}

}