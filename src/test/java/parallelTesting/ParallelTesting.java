package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

	WebDriver driver;

	@Test
	public void facebook() {		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void netflix() {
		driver=new EdgeDriver();
		driver.get("https://www.netflix.com/in/");
	}
	
	@Test
	public void prime() {
		driver=new ChromeDriver();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
	}

	@Test
	public void instagram() {
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	
}
