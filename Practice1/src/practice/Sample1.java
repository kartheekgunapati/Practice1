package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.configfile;

public class Sample1 {
	
	@Test
	public void testSample() throws Exception {
		configfile config = new configfile();
		System.setProperty("webdriver.chrome.driver",config.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(config.getFb());
		String tittle = driver.getTitle();
		System.out.println("Tittle of the page is : "+tittle);
		driver.findElement(By.id("email")).sendKeys("kartheek.gunapati");
		driver.findElement(By.name("pass")).sendKeys("90876576272");
		String lvalue = driver.findElement(By.name("login")).getAttribute("data-testid");
		System.out.println("Value of the Button 1 consists of : "+lvalue);
		String createAcct = driver.findElement(By.id("u_0_2")).getAttribute("data-testid");
//		/String createAcct = driver.findElement(By.id("u_0_2")).getText();
		System.out.println("Value of the Create Acct Button is : "+createAcct);
		driver.quit();
	}

}
