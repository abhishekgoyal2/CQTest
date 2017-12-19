/**
 * 
 */
package qa_cq_St_TC_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import qa_cq_strack.Qa_ST_home;

/**
 * @author abhishek.goyal2
 *
 */
@SuppressWarnings("unused")
public class Qa_cq_St_TC_login  {
 WebDriver  driver ;
	@Test
	public void verifyvalidlogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:/Projects/geckodriver-v0.16.0-win64/geckodriver.exe");


//		Qa_ST_home qa_Stlogin =new Qa_ST_home(driver);
		driver =new FirefoxDriver();
		
		driver.manage().window().maximize();

 String  Appurl ="http://cdev-st01.cq.com:8080/watershed/login?";
			driver.get(Appurl);
//		Qa_ST_home.setupBrowser();
//		qa_Stlogin.typeusername("abhishek.goyal2@globallogic.com");
//		Thread.sleep(1000);
//		qa_Stlogin.typepassword("Welcome@01");
//		Thread.sleep(1000);
//		qa_Stlogin.clickOnLoginButton();
		
//		Thread.sleep(5000);
	
//		qa_Stlogin.Statemapclickonhomepage();
		
//		Thread.sleep(3000);
//	qa_Stlogin.AdvancedSearch();
//		login.Alert();
		
//		Thread.sleep(1000);
//		Qa_ST_home.CloseBrowser();
		
	
	}
	
}
