package qa_cq_strack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

/**
 * @author abhishek.goyal2
 *
 */
public class Qa_ST_home {

	static WebDriver driver ;
		  By username =By.xpath(".//*[@id='username']");
		By password = By.xpath("html/body/div[2]/form/div[2]/input");
		By Loginbutton =By.xpath("html/body/div[2]/form/input");
		
		By AlertOk = By.xpath(".//*[@class='button ok-button']");
		By AdvancedSearch =By.xpath(".//*[@id='id3'and@class='search-advanced']");
		By Statemap = By.xpath(".//*[@id='sideRailTerritory-NH']");
		public static WebDriver setupBrowser() {
			Reporter.log("Session started",true);
			driver =new FirefoxDriver();
			
			driver.manage().window().maximize();

	 String  Appurl ="http://cdev-st01.cq.com:8080/watershed/login?";
				driver.get(Appurl);
				Reporter.log("Application launched",true);
//				driver.manage().wait();
				return driver;
		}
		
		public Qa_ST_home(WebDriver driver)
		{
			 Qa_ST_home.driver =driver;	
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
		
		
		public void AdvancedSearch ()
		{
			driver.findElement(AdvancedSearch).click();
		}
		
		public void Statemapclickonhomepage()
		{
			driver.findElement(Statemap).click();
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
	
		// TODO Auto-generated method stub

	}




/**
 * 
 */



//public class LoginPage {

