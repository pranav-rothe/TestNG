package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimeBrowser {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void primeApp() {
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
	}
	
	//@AfterClass
	public void teardown() {
		driver.quit();
	}

}
