package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlenews {
	public static void main(String args[]) throws Exception { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("google news");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//span[text()='Google News']")).click();
		Thread.sleep(3000);
		int x = driver.findElement(By.xpath("//a[text()='Cricket Australia \"Unreservedly Apologise\" After Indian Players Face Alleged Racial Abuse']")).getLocation().getX();
		int y = driver.findElement(By.xpath("//a[text()='Cricket Australia \"Unreservedly Apologise\" After Indian Players Face Alleged Racial Abuse']")).getLocation().getY();
		System.out.println("X Location is : "+x);
		System.out.println("Y Location is : "+y);
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='Cricket Australia \"Unreservedly Apologise\" After Indian Players Face Alleged Racial Abuse']"));
		int size = list.size();
		System.out.println("Sizze of the list is : "+size);
		for(int i=0; i<=size; i++) {
			int l1 = list.get(i).getLocation().getX();
			System.out.println("Size of the Location : "+l1);
			if(l1!=0) {
				list.get(i).click();
				break;
			}
		}
		driver.quit();
	}
	

}
