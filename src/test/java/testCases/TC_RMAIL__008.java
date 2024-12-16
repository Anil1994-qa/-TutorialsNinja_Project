package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AccountRigesterPage;
import pageObjects.HomePage;

public class TC_RMAIL__008 extends BaseClass {
@Test	
public void VerifyRegisterAccountWithRepeatEmail()
{
	HomePage hp=new HomePage(driver);
	hp.ClickonmyAccount();
    hp.Clickonregister();

   AccountRigesterPage reg=new AccountRigesterPage(driver);
	reg.setFirstname(randomString().toUpperCase());
	reg.setLastname(randomString().toUpperCase());
	reg.setEmail(p.getProperty("email"));
	reg.setTelphone(randomNum());
	String password=randomNum();
	reg.setPassword(password);
	reg.conFirmpwd(password);
	reg.NewsBtn();
	reg.privacyPolicy();
	reg.continueCta();

	String email=reg.excistingEmail();
   Assert.assertEquals(email,"Warning: E-Mail Address is already registered!");
	
	
}
	

}
