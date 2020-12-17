package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import utilities.configfile;

public class ExtentReport1 {
	
	@Test
	public void facebook() throws Exception {
		configfile config = new configfile();
		System.setProperty("webdriver.chrome.driver",config.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(config.getFb());
		String tittle = driver.getTitle();
		System.out.println("Tittle of the page is : "+tittle);
		driver.findElement(By.name("email")).sendKeys("kartheek.gunapati");
		String value = driver.findElement(By.name("login")).getAttribute("name");
		System.out.println("Tittle of the Button is : "+value);
		
		//ExtentHtmlReporter reporter = new ExtentHtmlReporter();
		//ExtentReports extent = new ExtentReports();
		
		
		
		
		
		driver.findElement(By.name("pass")).sendKeys("98866457273");
		
	}

}
