package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Htmlunit1 {
	
	@Test
	public void Fblogin() {
		HtmlUnitDriver driver = new HtmlUnitDriver(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String tittle = driver.getTitle();
		System.out.println("Tittle of the page is : "+tittle);
		driver.findElement(By.name("email")).sendKeys("kartheek.gunapati");
		driver.findElement(By.name("pass")).sendKeys("9876572627");
		String Login = driver.findElement(By.name("login")).getAttribute("name");
		System.out.println("Value of the button id : "+Login);
		driver.quit();
		
		
		
		
	}
	

}
