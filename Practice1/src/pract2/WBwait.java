package pract2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WBwait {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		//driver.findElement(By.name("identifier")).sendKeys("kartheek.gunapati");
		driver.findElement(By.linkText("Forgot email?")).click();
		//driver.findElement(By.xpath("//div[@class='VfPpkd-Jh9lGc']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}	

}
