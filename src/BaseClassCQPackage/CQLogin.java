package BaseClassCQPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CQLogin extends BaseClass {
	@Test(description="Valid login test")
	public void loginApplication() throws InterruptedException
		{
	//driver.findElement(By.id("txtUsername"));
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("abhishek.goyal2@globallogic.com");
	
	driver.findElement(By.xpath("html/body/div[2]/form/div[2]/input")).sendKeys("Welcome@01");
	
	driver.findElement(By.xpath("html/body/div[2]/form/input")).click();
//	driver.findElement(By.xpath(".//*[@id='headera']/div[1]/header/div[2]/div/div[1]/nav/section/ul/li[2]/ul/li[3]/a")).click();
	
	
	Thread.sleep(5000);

	}
}
