package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;
import testBase.BasePage;

public class MyAccountPage extends BasePage {
	
public MyAccountPage(WebDriver driver) {
		super(driver);
	
	}

@FindBy(xpath="//h2[normalize-space()='My Account']")
WebElement myaccount;
@FindBy(xpath="//input[@placeholder='Search']")
WebElement searchBar;
@FindBy(xpath="//i[@class='fa fa-search']")
WebElement btnSearch;
@FindBy(xpath="//a[normalize-space()='Continue']")
WebElement continuecta;
@FindBy(xpath="//a[normalize-space()='Subscribe / unsubscribe to newsletter']")
WebElement newsbtnlink;
@FindBy(xpath="//input[@name='newsletter'][@value='1']")
WebElement radiobtn;

	public boolean MyAccountpage()
	{
		return myaccount.isDisplayed();
	}
	
	public void SearchProduct(String product)
	{
	   searchBar.sendKeys(product);
	}
	public void ClickonSearch()
	{
		btnSearch.click();
	}
	public void clickOnContinue()
	{
		continuecta.click();
	}
	public void ClickOnNewsBtn()
	{
		newsbtnlink.click();
	}
	public void RadioBtn()
	{
		Assert.assertTrue(radiobtn.isSelected());
	}
}
