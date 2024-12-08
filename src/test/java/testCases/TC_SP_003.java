package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.SearchPage;

public class TC_SP_003 extends BaseClass{
@Test
public void SearchProduct()
{
	HomePage hp=new HomePage(driver);
	hp.ClickonmyAccount();
    hp.Clickonlogin();

    LoginPage log=new LoginPage(driver);
    log.SetEmail(p.getProperty("email"));
    log.setPwd(p.getProperty("password"));
    log.clickloginbtn();

    MyAccountPage myac =new MyAccountPage(driver);
    myac.SearchProduct(p.getProperty("SearchProductName"));
    myac.ClickonSearch();
    
    SearchPage sp=new SearchPage(driver);
    sp.SelectCategories();
    sp.ClickonCheckBox1();
    sp.ClickonCheckBox2();
    sp.ClickOnSearch();
    sp.Infotooltip();
    sp.SortBy();
    sp.Productvisible();
    sp.addTocart();
    sp.AlertMsg();

}
	
}
