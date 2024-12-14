package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountRigesterPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC_RPF_006 extends BaseClass{
@Test	
public void VerifyRegisterPagesUsingMultipleWays()
{
	
	logger.debug("Test Started TC_RPF_006");
	
	HomePage hp=new HomePage(driver);	
	hp.ClickonmyAccount();
    hp.Clickonregister();
   
    AccountRigesterPage reg=new AccountRigesterPage(driver); 
    		reg.registerPage();
    		
    hp.ClickonmyAccount();
    hp.Clickonlogin();
    AccountRigesterPage reg1=new AccountRigesterPage(driver);
    reg1.registerPage();
    
	LoginPage lp=new LoginPage(driver);
	lp.ClickOnContinue();
	lp.ClickRegister();
	AccountRigesterPage reg2=new AccountRigesterPage(driver);
	reg2.registerPage();
	
	
	
	
	
	
	
	
}

}
