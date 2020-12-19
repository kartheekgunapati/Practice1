package Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Windows2 extends Baseclass {
	
	@Test
	public void flipkartOperations() throws Exception {
		String parent = driver.getWindowHandle();
		System.out.println("Tittle of the Parent page is : "+parent);
		driver.findElement(By.name("q")).sendKeys("Smartphones under 15000");
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Victory Blue, 64 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 128 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 64 GB)']")).click();
		Set<String> list01 = driver.getWindowHandles();
		int count = list01.size();
		System.out.println("Size of the Set is : "+count);
		for(String child : list01) {
			String ctittle = driver.getTitle();
			System.out.println("Child window tittle is : "+ctittle);
			if(!parent.equalsIgnoreCase(ctittle)) {
				driver.switchTo().window(child);
				Thread.sleep(2000);
				//driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
		
	}
	
}
