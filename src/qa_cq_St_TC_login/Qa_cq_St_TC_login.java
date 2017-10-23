/**
 * 
 */
package qa_cq_St_TC_login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import qa_cq_strack.Qa_ST_home;

/**
 * @author abhishek.goyal2
 *
 */
@SuppressWarnings("unused")
public class Qa_cq_St_TC_login  {
static WebDriver  driver ;
	@Test
	public void verifyvalidlogin() throws InterruptedException
	{
	
	
//driver =new FirefoxDriver();
//		
//	driver.manage().window().maximize();

//		 String  Appurl ="http://10.123.134.117:8080/";
//			driver.get(Appurl);
//			Reporter.log("Application launched",true);
//driver.get("http://10.123.134.117:8080/");

		Qa_ST_home qa_Stlogin =new Qa_ST_home(driver);

			

		Qa_ST_home.setupBrowser();
		qa_Stlogin.typeusername("abhishek.goyal2@globallogic.com");
		Thread.sleep(1000);
		qa_Stlogin.typepassword("Welcome@01");
		Thread.sleep(1000);
		qa_Stlogin.clickOnLoginButton();
		
		Thread.sleep(3000);
//		login.Alert();
		
		Thread.sleep(1000);
		qa_Stlogin.CloseBrowser();
		
	
	}
	
}
