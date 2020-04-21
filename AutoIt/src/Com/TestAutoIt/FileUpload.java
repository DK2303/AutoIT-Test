package Com.TestAutoIt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;

	@BeforeClass
	public void driver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Project\\Chrome Driver\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver= new ChromeDriver(opt);
	}

	@Test
	public void autoItFileUpload() throws Exception {
		
		Actions ac = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,60);

		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.manage().window().maximize();

		ac.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//body/form/input[@name='userfile']"))))).click().build().perform();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("C:\\Users\\whirldata-sa\\Desktop\\AutoIt\\File1.exe");
	}

}


