package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
