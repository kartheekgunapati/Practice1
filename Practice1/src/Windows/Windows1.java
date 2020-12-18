package Windows;


import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Windows1 extends Baseclass {
	
	@Test
	public void flipKart1() throws Exception {
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Window Tiitle is : "+parentWin);
		driver.findElement(By.name("q")).sendKeys("Smartphones under 10000");
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20A (Victory Blue, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20A (Glory Silver, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='POCO M2 (Pitch Black, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme C15 Qualcomm Edition (Power Blue, 64 GB)']")).click();
		Set<String> set1 = driver.getWindowHandles();
		int count = set1.size();
		System.out.println("Total Windows are : "+count);
		for(String childWin : set1) {
			if(!parentWin.equalsIgnoreCase(childWin)) {
				driver.switchTo().window(childWin);
				String ctittle = driver.getTitle();
				System.out.println("Child Window Tittle is : "+ctittle);
				Thread.sleep(3000);
				driver.close();
			}
		}
	}
	
	

}
