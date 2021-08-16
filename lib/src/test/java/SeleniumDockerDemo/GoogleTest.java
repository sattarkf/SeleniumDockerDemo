package SeleniumDockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GoogleTest {
	
	@Test
	public void googleTitleTest() throws MalformedURLException {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();

		RemoteWebDriver driver;
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability("version", "");
		cap.setCapability("platform", "LINUX");
		driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), cap);
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("google title is: "+title);
		
		Assert.assertEquals(title,"Google");
		
		driver.quit();
	}

}
