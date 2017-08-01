/**
 * 
 */
package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author abhishek.goyal2
 *
 */
public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver startBrowser(String BrowserName,String url) 
	{
		if (BrowserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if (BrowserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if (BrowserName.equalsIgnoreCase("IE"))
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}

}
