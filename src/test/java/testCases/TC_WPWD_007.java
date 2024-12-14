package testCases;

import org.testng.Assert;

import pageObjects.AccountRigesterPage;
import pageObjects.HomePage;

public class TC_WPWD_007 extends BaseClass{

public void VerifyWorngPwdMsg()
{
	   HomePage hp=new HomePage(driver);
	   hp.ClickonmyAccount();
       hp.Clickonregister();

	   AccountRigesterPage reg=new AccountRigesterPage(driver);
	   reg.setFirstname(randomString().toUpperCase());
	   reg.setLastname(randomString().toUpperCase());
	   reg.setEmail(randomString().toUpperCase()+"@gmail.com");
	   reg.setTelphone(randomNum());
	   reg.setPassword(randomNum());
	   reg.conFirmpwd(randomNum());
	   reg.privacyPolicy();
       reg.continueCta();	   
       
       String invalidPwdMsg=reg.WrongMsg();
       Assert.assertEquals(invalidPwdMsg, "Password confirmation does not match password!");
}
}
