package Windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Window4 {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserSetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void flipKart() {
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Smartphones under 15000");
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Victory Blue, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme 6 (Comet Blue, 64 GB)']")).click();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window is : "+parent);
		Set<String> set1 = driver.getWindowHandles();
		int size = set1.size();
		System.out.println("Size of the Set is : "+size);
		for(String child : set1) {
			driver.switchTo().window(child);
			String ctitle = driver.getTitle();
			System.out.println("Child Tittle is : "+ctitle);
			if(!parent.equalsIgnoreCase(child)){
				boolean cond = driver.findElement(By.xpath("//div[@class='_3PzNI- _3EPyR5']")).isDisplayed();
				if(cond==true) {
					String elewind = driver.getTitle();
					System.out.println("Element Available in the Webpage is : "+elewind);
					//driver.close();
					break;
				}
				
			}
		driver.close();
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
