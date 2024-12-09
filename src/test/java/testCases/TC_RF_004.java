package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRigesterPage;
import pageObjects.HomePage;

public class TC_RF_004 extends BaseClass{
@Test	
public void verifyRegisterAccountWithoutDetails()
{
	HomePage hp=new HomePage(driver);
	hp.ClickonmyAccount();
    hp.Clickonregister();

   AccountRigesterPage reg=new AccountRigesterPage(driver);
   reg.continueCta();
   reg.AlertMsg();
}

}
