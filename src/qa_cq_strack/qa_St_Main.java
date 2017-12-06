package qa_cq_strack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qa_St_Main {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver ;
		 
		 System.setProperty("webdriver.gecko.driver", "C:/Projects/geckodriver-v0.16.0-win64/geckodriver.exe");


//			Qa_ST_home qa_Stlogin =new Qa_ST_home(driver);
			driver =new FirefoxDriver();
			
			driver.manage().window().maximize();
			String  Appurl ="http://cdev-st01.cq.com:8080/watershed/login?";
	driver.get(Appurl);
			@SuppressWarnings("unused")
			By AdvancedSearch =By.xpath(".//*[@id='id3'and@class='search-advanced']");
			By Statemap = By.xpath(".//*[@id='sideRailTerritory-NH']");
			  By username =By.xpath(".//*[@id='username']");
				By password = By.xpath("html/body/div[2]/form/div[2]/input");
				By Loginbutton =By.xpath("html/body/div[2]/form/input");
			
				
					driver.findElement(username).sendKeys("abhishek.goyal2@globallogic.com");
				Thread.sleep(2000);
					driver.findElement(password).sendKeys("Welcome@01");
					Thread.sleep(2000);

					driver.findElement(Loginbutton).click();
					Thread.sleep(4000);

//				driver.findElement(AdvancedSearch).click();
			
			
				driver.findElement(Statemap).click();
		
				Thread.sleep(2000);

			


		// TODO Auto-generated method stub

	}

}
