package kiteAppPom_Listeners_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin_page 
{
    //1.variables
	
	@FindBy (id="pin") private WebElement PIN;
	@FindBy (xpath="//button[@type='submit']") private WebElement continueButton;
    
	//2.constructor
	public KitePin_page(WebDriver driver) 
	{
		PageFactory.initElements( driver, this);
		
	}
	//3.methods
    public void sendPin(String pin)
    {
    	PIN.sendKeys(pin);
    }
    
    public void clickoncontinuebutton()
    {
    	continueButton.click();
    }
}
