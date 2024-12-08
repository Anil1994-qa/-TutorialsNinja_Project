package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement myaccount;
@FindBy(xpath="//a[text()='Register']")
WebElement register;
@FindBy(xpath="//a[normalize-space()='Login']")
WebElement login;


//Action Methods
public void ClickonmyAccount()
{
	myaccount.click();
}
public void Clickonregister()
{
	register.click();
}
public void Clickonlogin()
{
	login.click();
}

}
