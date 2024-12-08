package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public WebDriver driver;
public Properties p;

@BeforeClass
void Setup() throws IOException
{
	
	 driver=new EdgeDriver();
 	 driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://tutorialsninja.com/demo/");
     driver.manage().window().maximize();
     
   //Load properties file
   		FileReader file= new FileReader("./src//test//resources//config.properties");
   		p=new Properties();
   		p.load(file);
}
@AfterClass	
void tearDown()
{
  driver.quit();
}

public String randomString()  //created method to generate random Strings {
{	
         String genratedString= RandomStringUtils.randomAlphabetic(5);
	 	 return genratedString;
}
public String randomNum()//created method to generate random Numbers
{
	 	 String genratedNum= RandomStringUtils.randomNumeric(10);
	 	 return genratedNum;
}
public String randomAlphaNum()//created method to generate random Alpha numeric methods
{
	 	 String genratedString= RandomStringUtils.randomAlphabetic(3);
	 	 String genratedNum= RandomStringUtils.randomAlphabetic(3);
	 	 return genratedNum+"@"+genratedString;
}

}
