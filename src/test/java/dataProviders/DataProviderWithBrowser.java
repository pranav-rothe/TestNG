package dataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithBrowser 
{

	WebDriver driver;

	@BeforeMethod
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(dataProvider = "LoginData")
	public void TC01(String user, String pass) 
	{
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //login click

		WebElement text = driver.findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6')]"));
		boolean b = text.isDisplayed();

		Assert.assertTrue(b, "Invalid Credential");
	}

	@DataProvider(name="LoginData")
	public Object[][] testData() 
	{
		return new Object[][] { 
			{ "Admin", "admin123" }, 
			{ "Pranav", "pranav@123" }, 
			{ "Aman", "aman@123" } 
		};
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
