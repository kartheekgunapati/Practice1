package Listners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.TestNGListeners2.class)

public class Fbtestcases2 extends BaseClass{
	
	@Test
	public void login() throws Exception {
		driver.findElement(By.id("email")).sendKeys("kartheek.gunpatai");
		driver.findElement(By.name("pass")).sendKeys("abcdefghijklm");
	}
	
	@Test(dependsOnMethods="login")
	public void forgot() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("kartheek.gunapati");
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		String tittle = driver.getTitle();
		System.out.println("Tittle : "+tittle);
		Assert.assertTrue(tittle.contains("Facebook"));
	}
	
	@Test(dependsOnMethods="forgot")
	public void signup() {	
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.id("identify_email")).sendKeys("kartheek.gunapati");
		//driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.findElement(By.id("email")).sendKeys("kartheejk.gunapati");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.name("firstname")).sendKeys("Reddy");
		driver.findElement(By.name("lastname")).sendKeys("gunapati");
	}	
	
	

	
	

}