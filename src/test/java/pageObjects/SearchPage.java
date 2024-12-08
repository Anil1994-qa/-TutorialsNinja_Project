package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import testBase.BasePage;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
@FindBy(xpath="//select[@name='category_id']")
WebElement categoriesEle;
@FindBy(xpath="//input[@name='sub_category']")
WebElement chkBox;
@FindBy(xpath="//input[@id='description']")
WebElement chkBox1;
@FindBy(xpath="//input[@id='button-search']")
WebElement clickonSearch;
//After selecting Product
@FindBy(xpath="//i[@class='fa fa-th-list']")
WebElement infoTootltip;
@FindBy(xpath="//select[@id='input-sort']")
WebElement SortBy;
@FindBy(xpath="//img[@title='iMac']")
WebElement macimg;
@FindBy(xpath="//span[normalize-space()='Add to Cart']")
WebElement addtocart;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement aleartmsg;


public void SelectCategories()
{
	categoriesEle.click();
	Select categories=new Select(categoriesEle);
	categories.selectByValue("27");
}
	
public void ClickonCheckBox1()	
{
	chkBox.click();
}
public void ClickonCheckBox2()
{
	chkBox1.click();
}
public void ClickOnSearch()
{
	clickonSearch.click();
}
public void Infotooltip()
{
	infoTootltip.click();
}
public void SortBy()
{
	SortBy.click();
  Select sortby=new Select(SortBy);
  sortby.selectByVisibleText("Price (Low > High)");
}
public boolean Productvisible()
{
	macimg.isDisplayed();
	return true;
}
public void addTocart()	
{
	addtocart.click();
}
public boolean AlertMsg()
{
	aleartmsg.isDisplayed();
	return true;
}
}
