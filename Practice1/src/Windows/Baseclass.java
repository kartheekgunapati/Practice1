package Windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserSetUp() throws Exception {
		Configfile1  config = new Configfile1();
		System.setProperty("webdriver.chrome.driver",config.getChrome());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(config.getFlipkart());
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.manage().deleteAllCookies();
		driver.quit();
	}

}
