package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
//Locaters
@FindBy(xpath="//input[@id='input-email']")
WebElement email;
@FindBy(xpath="//input[@id='input-password']")
WebElement pwd;
@FindBy(xpath="//input[@value='Login']")
WebElement btnlogin;
	
//Action Methods
public void SetEmail(String email)
{
   this.email.sendKeys(email);
}
public void setPwd(String pwd)
{
	this.pwd.sendKeys(pwd);
}
public void clickloginbtn()
{
	btnlogin.click();
}

}
