package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookBrowser {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Test
	public void facebookApp() {
		driver.get("https://www.facebook.com/");
	}

	//@AfterClass
	public void teardown() {
		//driver.quit();
		System.out.println("all open parallel");
	}

}
