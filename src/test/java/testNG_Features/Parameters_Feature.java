package testNG_Features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters_Feature {


	WebDriver driver;

	@Parameters({"URL"})
	@BeforeMethod
	@SuppressWarnings("deprecation")
	public void setUp(String URL) {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		System.out.println("Opening browser");
	}

	@Parameters({"USERNAME", "PASSWORD"})
	@Test
	public void loginTest(String user, String pass) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user); //passing username
		System.out.println("Entering usernmae");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass); //passing password
		System.out.println("Entering password");

		driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
		System.out.println("Click on login");
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();
	}

}
