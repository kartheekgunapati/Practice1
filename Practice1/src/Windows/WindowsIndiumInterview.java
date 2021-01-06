package Windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsIndiumInterview {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Smartphones under 15000");
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Victory Blue, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Realme 7i (Fusion Blue, 128 GB)']")).click();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window tittle : "+parent);
		Set<String> list = driver.getWindowHandles();
		int s = list.size();
		System.out.println("Size of the list is : "+s);
		for(String child : list) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				String childwind = driver.getTitle();
				System.out.println("Child Window Tittle is : "+childwind);
				boolean cond = driver.findElement(By.xpath("//div[@class='_3PzNI- _3EPyR5']")).isDisplayed();
					if(cond==false) {
						String elewind = driver.getTitle();
						System.out.println("Element Available in the Webpage is : "+elewind);
						driver.close();
						break;
					}
			}
		}
		System.out.println("WebElement isn't present in the browser windows");
		driver.quit();
	}
}
