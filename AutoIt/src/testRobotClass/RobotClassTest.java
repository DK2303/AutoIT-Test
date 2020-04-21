package testRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RobotClassTest {
	WebDriver driver;

	@BeforeClass
	public void drive() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Project\\Chrome Driver\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver= new ChromeDriver(opt);

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();

		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);

		try {
			// now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:\\Users\\whirldata-sa\\WorkSpace-Selenium\\AutoIt\\ScreenShort\\sfLogIn.png"));
		}catch(Exception e) {
			System.out.println(e);
		}


	}

	@Test
	public void robotClassPrctice() throws AWTException, InterruptedException {
		Robot key= new Robot();

		driver.findElement(By.id("username"));
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_D);
		key.keyPress(KeyEvent.VK_I);
		key.keyPress(KeyEvent.VK_N);
		key.keyPress(KeyEvent.VK_E);
		key.keyPress(KeyEvent.VK_S);
		key.keyPress(KeyEvent.VK_H);
		key.keyPress(KeyEvent.VK_2);
		key.keyPress(KeyEvent.VK_3);
		key.keyPress(KeyEvent.VK_0);
		key.keyPress(KeyEvent.VK_3);
		key.keyPress(KeyEvent.VK_SHIFT);
		key.keyPress(KeyEvent.VK_2);
		key.keyRelease(KeyEvent.VK_SHIFT);
		key.keyPress(KeyEvent.VK_G);
		key.keyPress(KeyEvent.VK_M);
		key.keyPress(KeyEvent.VK_A);
		key.keyPress(KeyEvent.VK_I);
		key.keyPress(KeyEvent.VK_L);
		key.keyPress(KeyEvent.VK_PERIOD);
		key.keyPress(KeyEvent.VK_C);
		key.keyPress(KeyEvent.VK_O);
		key.keyPress(KeyEvent.VK_M);

		key.keyPress(KeyEvent.VK_TAB);
		key.keyRelease(KeyEvent.VK_TAB);

		driver.findElement(By.id("password"));
		key.keyPress(KeyEvent.VK_SHIFT);
		key.keyPress(KeyEvent.VK_D);
		key.keyRelease(KeyEvent.VK_SHIFT);
		key.keyPress(KeyEvent.VK_I);
		key.keyPress(KeyEvent.VK_N);
		key.keyPress(KeyEvent.VK_E);
		key.keyPress(KeyEvent.VK_S);
		key.keyPress(KeyEvent.VK_H);
		key.keyPress(KeyEvent.VK_1);
		key.keyPress(KeyEvent.VK_2);
		key.keyPress(KeyEvent.VK_3);

		key.keyPress(KeyEvent.VK_TAB);
		key.keyRelease(KeyEvent.VK_TAB);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);

		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);

		try {
			// now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:\\Users\\whirldata-sa\\WorkSpace-Selenium\\AutoIt\\ScreenShort\\sfHome.png"));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
