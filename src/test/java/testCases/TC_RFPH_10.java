package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;

public class TC_RFPH_10 extends BaseClass{
@Test
public void VerifyPlaceHolderinRAPage()
{
	HomePage hp=new HomePage(driver);
	hp.ClickonmyAccount();
    hp.Clickonregister();
	
    logger.info("TC_RFPH_10 Test case is Finished");   
    
    String ExpectedFirstNameceHolderName="First Name";
    String ActualFristName= driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
    Assert.assertEquals(ExpectedFirstNameceHolderName, ActualFristName);
   
   
    String ExpectedLastNameceHolderName="Last Name";
    String ActualLastname= driver.findElement(By.id("input-lastname")).getAttribute("placeholder");
    Assert.assertEquals(ExpectedLastNameceHolderName, ActualLastname);
    
    
    String ExpectedEmailHolername="E-Mail";
    String ActualEmail=driver.findElement(By.id("input-email")).getAttribute("placeholder");
    Assert.assertEquals(ExpectedEmailHolername, ActualEmail);
    
    String ExpectedTelephoneHolderName="Telephone";
    String ActualTelephone=driver.findElement(By.id("input-telephone")).getAttribute("placeholder");
    Assert.assertEquals(ExpectedTelephoneHolderName, ActualTelephone);
    
    String ExpectedPassWordHolderName="Password";
    String ActualPwd=driver.findElement(By.id("input-password")).getAttribute("placeholder");
    Assert.assertEquals(ExpectedPassWordHolderName, ActualPwd);
    
    String ExpectedConfirmPassward="Password Confirm";
    String ActualCpwd=driver.findElement(By.id("input-confirm")).getAttribute("placeholder");
    Assert.assertEquals(ExpectedConfirmPassward, ActualCpwd);
    
    logger.info("TC_RFPH_10 Test case is Finished");
   
    
}
}
