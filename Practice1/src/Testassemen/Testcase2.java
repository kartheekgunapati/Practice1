package Testassemen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase2 {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Title of the Page is : "+title);
		driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("KARTHEEK REDDY GUNAPATI");
		String fname = driver.findElement(By.xpath("//input[contains(@name,'ail')]")).getAttribute("value");
		System.out.println("Email field entered value is : "+fname);
		driver.findElement(By.xpath("//input[starts-with(@name,'pas')]")).sendKeys("9876yueywv1233");
		String pwd = driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).getAttribute("value");
		System.out.println("Password field Value is : "+pwd);
		driver.quit();
	}

}
