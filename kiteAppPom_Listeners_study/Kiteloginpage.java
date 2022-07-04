package kiteAppPom_Listeners_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage 
{
  //1.variables
	@FindBy (id="userid")  private WebElement UN;
	@FindBy (id="password")  private WebElement PWD;
	@FindBy (xpath = "//button[@type='submit']") private WebElement Longinbutton;
	
	//2. construct
	public Kiteloginpage(WebDriver driver)
	{
	  PageFactory.initElements( driver,this);	
	}
	

	//3.methods
	public void sendusername(String userName)
	{
		UN.sendKeys(userName);
	}
	
	public void sendpassword(String pwd)
	{
		PWD.sendKeys(pwd);
	}
	
	public void clickonlonginbutton()
	{
		Longinbutton.click();
	}
		
	
}
