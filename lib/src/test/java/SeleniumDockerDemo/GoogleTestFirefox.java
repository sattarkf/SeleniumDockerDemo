package SeleniumDockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GoogleTestFirefox {
	
	@Test
	public void googleTitleTest() throws MalformedURLException {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();

		//RemoteWebDriver driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		//cap.setCapability("version", "");
		//cap.setCapability("platform", "LINUX");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), cap);
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("google title is: "+title);
		
		try {
		Assert.assertEquals(title,"Google");
		}
		catch (Exception e) {
			System.out.println("executed this line 1");
			driver.quit();
		}
		finally {
			System.out.println("executed this line 2");
		driver.quit();
		}
	}

}
