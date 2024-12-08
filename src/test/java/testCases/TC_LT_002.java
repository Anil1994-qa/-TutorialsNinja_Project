package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_LT_002 extends BaseClass {
@Test
public void verifylogin()
{
	HomePage hp= new HomePage(driver);
	hp.ClickonmyAccount();
	hp.Clickonlogin();

    LoginPage login= new LoginPage(driver);
    login.SetEmail(p.getProperty("email"));
    login.setPwd(p.getProperty("password"));
    login.clickloginbtn();
    
    MyAccountPage page=new MyAccountPage(driver);
    boolean mypage=page.MyAccountpage();
    Assert.assertTrue(mypage);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
