package Testassemen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase4 {
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		String email = driver.findElement(By.id("email")).getAttribute("value");
		driver.findElement(By.xpath("//input[contains(@name,'pas')]")).sendKeys("");
		String pwd = driver.findElement(By.name("pass")).getAttribute("value");
		System.out.println("Email & Password are : "+email+" & "+pwd);
		String log = driver.findElement(By.name("login")).getText();
		System.out.println("Text Field on Login Button is : "+log);
		driver.findElement(By.xpath("//button[contains(@name,'ogi')]")).click();
		Thread.sleep(2000);
		String tittle = driver.getTitle();
		System.out.println("Tittle of the page is : "+tittle);
		driver.quit();
	}

}
