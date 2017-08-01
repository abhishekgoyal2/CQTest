package BaseClassCQPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	static WebDriver driver ;
	@BeforeClass
	public static WebDriver setupBrowser() throws InterruptedException{
		Reporter.log("Session started",true);
		driver =new FirefoxDriver();
		
		driver.manage().window().maximize();

 String  Appurl ="http://10.123.134.117:8080/";
			driver.get(Appurl);
			Reporter.log("Application launched",true);
//			driver.manage().wait();
			return driver;
	}

	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
	}
	}


