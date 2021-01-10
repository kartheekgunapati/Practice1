package Swiggy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserLaunch() throws Exception {
		Config con = new Config();
		System.setProperty("webdriver.chrome.driver",con.getChrome());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(con.getSwiggy());
		
	}
	
	@AfterClass
	public void tearDown() {	
		driver.manage().deleteAllCookies();
		driver.quit();
	}
		
	

}
