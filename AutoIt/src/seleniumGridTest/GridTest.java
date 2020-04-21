package seleniumGridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {

	WebDriver driver;
	String baseURL, nodeURL;
	
	@Test
	public void setUP() throws MalformedURLException {
		baseURL="https://login.salesforce.com/";
		nodeURL="http://192.168.43.65:4444/wd/hub";
				
		DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);
        FirefoxOptions options = new FirefoxOptions();

        driver = new RemoteWebDriver(new URL(nodeURL), capability);
	}
}
