package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_ARMK_009 {
@Test
	
public void RegisterAccountwithUsingkeyboardMouseAction() 
{
	WebDriver driver=new EdgeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement myac=driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	WebElement reg=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", myac);
	jse.executeScript("arguments[0].click()", reg);
	
	
	Actions act=new Actions(driver);
	for(int i=0;i<=22;i++)
	{
	act.sendKeys(Keys.TAB).perform();
	}
	act.sendKeys("Anil Kumar");
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("N");
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("adcd123@gmail.com");
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("123456789");
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("12345");
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("12345");
	act.sendKeys(Keys.TAB).perform();
   act.sendKeys(Keys.ARROW_RIGHT).click().perform();
   act.sendKeys(Keys.TAB).perform();
   act.sendKeys(Keys.TAB).perform();
   act.sendKeys(Keys.SPACE).perform();
   act.sendKeys(Keys.ENTER).perform();
}

}
