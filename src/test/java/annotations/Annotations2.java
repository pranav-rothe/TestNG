package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations2 {


	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
		System.out.println("@BeforeMethod ==> open browser");
	}

	@Test
	public void verifyLoginPageTitle() {		
		String titleLoginPage=driver.getTitle();
		System.out.println(titleLoginPage);
		System.err.println("@Test ==>verify login page title");
	}
	
	@Test
	public void verifyLoginPageLogo() {
		boolean logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(logo);
		System.err.println("@Test ==> verify login page logo");
	}

	@AfterMethod
	public void tearDown() {		
		driver.quit();
		System.out.println("@AfterMethod ==> close browser");
	}



}
