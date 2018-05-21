/**
 * 
 */
package cq.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

/**
 * @author abhishek.goyal2
 *
 */
public class LoginPage {
static WebDriver driver ;
	  By username =By.xpath(".//*[@id='username']");
	By password = By.xpath("html/body/div[2]/form/div[2]/input");
	By Loginbutton =By.xpath("html/body/div[2]/form/input");
	
	By AlertOk = By.xpath(".//*[@class='button ok-button']");
	
	public static WebDriver setupBrowser() {
		Reporter.log("Session started",true);
		driver =new FirefoxDriver();
		
		driver.manage().window().maximize();

 String  Appurl ="https://plus.cq.com/";
			driver.get(Appurl);
			Reporter.log("Application launched",true);
//			driver.manage().wait();
			return driver;
	}
	
	public LoginPage(WebDriver driver)
	{
	LoginPage.driver =driver;	
	}


	public  void typeusername(String uid )
	{
		driver.findElement(username).sendKeys(uid);
	
	}
	
	public void typepassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginButton ()
	{
		driver.findElement(Loginbutton).click();
	}
	
	public  void Alert( )
	{
		driver.findElement(AlertOk).click();
	
	}
	
	
	public static WebDriver CloseBrowser()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		return driver;
	}
}
