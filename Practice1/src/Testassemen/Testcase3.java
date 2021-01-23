package Testassemen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='pass']//preceding::input[1]")).sendKeys("KARTHEEK reddy GUNAPATI");
		String val = driver.findElement(By.xpath("//input[contains(@id,'ema')]")).getAttribute("value");
		System.out.println("Email is : "+val);
		driver.findElement(By.xpath("//input[@id='email']//following::input[1]")).sendKeys("Okaguey686823");
		String pwd = driver.findElement(By.id("pass")).getAttribute("value");
		System.out.println("Password is : "+pwd);
		String login = driver.findElement(By.xpath("//button[contains(@name,'ogi')]")).getText();
		System.out.println("Login Button value : "+login);
		driver.quit();
	}

}
