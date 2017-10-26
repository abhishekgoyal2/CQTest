/**
 * 
 */
package cq.com.Pages.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cq.com.Pages.LoginPage;

/**
 * @author abhishek.goyal2
 *
 */
@SuppressWarnings("unused")
public class VerifyLoginpage  {
static WebDriver  driver ;
	@Test
	public void verifyvalidlogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:/software/geckodriver-v0.19.0-win64/geckodriver.exe");

	
//driver =new FirefoxDriver();
//		
//	driver.manage().window().maximize();

//		 String  Appurl ="http://10.123.134.117:8080/";
//			driver.get(Appurl);
//			Reporter.log("Application launched",true);
//driver.get("http://10.123.134.117:8080/");

LoginPage login =new LoginPage(driver);

			

LoginPage.setupBrowser();
		login.typeusername("abhishek.goyal2@globallogic.com");
		Thread.sleep(1000);
		login.typepassword("Welcome@01");
		Thread.sleep(1000);
		login.clickOnLoginButton();
		
		Thread.sleep(3000);
//		login.Alert();
		
		Thread.sleep(1000);
LoginPage.CloseBrowser();
		
	
	}
	
}
