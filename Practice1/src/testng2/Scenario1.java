package testng2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scenario1 extends BaseClass {
	
	@Test
	public void login() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kartheek.gunpatai");
		driver.findElement(By.name("pass")).sendKeys("abcdefghijklm");
	}

}
