package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;
import testBase.BasePage;

public class AccountRigesterPage extends BasePage{

	public AccountRigesterPage(WebDriver driver) 
	{
		super(driver);
	}
	
//Locaters
@FindBy(xpath="//input[@id='input-firstname']") 
WebElement txtfristname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtlastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPwd;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtconfirmpwd;

@FindBy(xpath="//input[@name='agree']")
WebElement chkpolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfrimation;

@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
WebElement alertmsg;

@FindBy(xpath="//input[@name='newsletter'][@value='1']")
WebElement newsbtn;

@FindBy(xpath="//h1[normalize-space()='Register Account']")
WebElement registerpage;

@FindBy(xpath="//div[@class='text-danger']")
WebElement wrongPwdmsg;

//Action Methods
public void setFirstname(String fname) //This string parameter is taken from test case
{
	txtfristname.sendKeys(fname);
}
public void setLastname(String lname)
{
	txtlastname.sendKeys(lname);
}
public void setEmail(String email)
{
	txtemail.sendKeys(email);
}
public void setTelphone(String tel)
{
	txtTelephone.sendKeys(tel);
}
public void setPassword(String pwd)
{
	txtPwd.sendKeys(pwd);
}
public void conFirmpwd(String cPwd)
{
	txtconfirmpwd.sendKeys(cPwd);
}
public void privacyPolicy()
{
	chkpolicy.click();
}
public void continueCta()
{
	btnContinue.click();
}
public String getConfirmation()
{
	try {
	return(msgConfrimation.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
}
public String AlertMsg()
{
	try
	{
		return(alertmsg.getText());
	}catch(Exception e)
	{
		return(e.getMessage());
	}
}
public void NewsBtn()
{
	newsbtn.click();
}
public String registerPage()
{
	try {
   return(registerpage.getText());
	}catch(Exception e)
	{
	return(e.getMessage());
	}
}
public String WrongMsg()
{  
	try {
		
	 return(wrongPwdmsg.getText());
	 
	}catch(Exception e)
	
	{
	return(e.getMessage());
	}
}
	
	
}




