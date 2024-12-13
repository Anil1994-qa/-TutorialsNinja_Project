package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRigesterPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

public class TC_NL_005 extends BaseClass{

@Test
public void VerifyRegistringAccountBySubscribingNewsLetter() {
		
	logger.info("TC_NL_005 Test Is Started");
	
	 HomePage hp=new HomePage(driver);
	 hp.ClickonmyAccount();
     hp.Clickonregister();
	
     AccountRigesterPage reg=new AccountRigesterPage (driver);
     reg.setFirstname(randomString().toUpperCase());
     reg.setLastname(randomString().toUpperCase());
     reg.setEmail(randomString()+"@gmail.com");
     reg.setTelphone(randomNum());
     
     String pwd=randomNum();
     reg.setPassword(pwd);
     reg.conFirmpwd(pwd);
     
     reg.NewsBtn();
     reg.privacyPolicy();
     reg.continueCta();
     
     MyAccountPage myac=new MyAccountPage(driver);
     myac.clickOnContinue();
     myac.ClickOnNewsBtn();
     myac.RadioBtn();
     logger.info("TC_NL_005 Test is Finished");
	
	}	
}
