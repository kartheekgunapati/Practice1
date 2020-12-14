package testng2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario2 extends BaseClass {
	
	@Test
	public void forgot() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("kartheek.gunapati");
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		String tittle = driver.getTitle();
		System.out.println("Tittle : "+tittle);
		Assert.assertTrue(tittle.contains("Facebook"));
	}

}
