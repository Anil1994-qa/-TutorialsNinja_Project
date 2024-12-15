package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
public WebDriver driver;
public Properties p;
public Logger logger;  //log4j

@BeforeClass
@Parameters({"os","browser"})
public void Setup(String os, String br) throws IOException
{   
	logger=LogManager.getLogger(this.getClass());
	
	   //Load properties file
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
	
	switch(br.toLowerCase())
	{
	case "chrome":driver=new ChromeDriver();break;
	case "edge":driver=new EdgeDriver();break;
	case "firefox" : driver=new FirefoxDriver();break;
	default :System.out.println("Invalid Browser"); //Here return() do if browser is invalid it will stop executing the rest of the code
	}
 	 driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get(p.getProperty("appURL"));
     driver.manage().window().maximize();
     
   
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
