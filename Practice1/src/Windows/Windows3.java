package Windows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Windows3 extends Baseclass{
	
	@Test
	public void flipkartOption3() throws Exception {
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
		Set<String> list1 = driver.getWindowHandles();
		int count = list1.size();
		System.out.println("Total Windows in the page is : "+count);
		ArrayList<String> list2 = new ArrayList<String>(list1);
		driver.switchTo().window(list2.get(0));
		String fwin = driver.getTitle();
		System.out.println("Tittle of the 1 window is : "+fwin);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(list2.get(1));
		String swin = driver.getTitle();
		System.out.println("Tittle of the 1 window is : "+swin);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(list2.get(2));
		String twin = driver.getTitle();
		System.out.println("Tittle of the 1 window is : "+twin);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		driver.close();
		//driver.switchTo().window(parent);
		//Thread.sleep(3000);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		
		
		
	}

}
