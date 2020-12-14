package testng2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scenario3 extends BaseClass {
	
	@Test
	public void signup() {	
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("kartheek.gunapati");
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.id("email")).sendKeys("kartheejk.gunapati");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.name("firstname")).sendKeys("Reddy");
		driver.findElement(By.name("lastname")).sendKeys("gunapati");
		//driver.findElement(By.id("lastname")).sendKeys("gunapati");
	}	

} 
