package Webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/sql/");
		WebElement join = driver.findElement(By.xpath("//a[text()='SQL Right Join']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",join);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='SQL Full Join']")).click();
		WebElement tab = driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]"));
		js.executeScript("arguments[0].scrollIntoView(true);",tab);
		Thread.sleep(5000);
		List<WebElement> table = driver.findElements(By.tagName("table"));
		int ctable = table.size();
		System.out.println("Total Number of tables present in this page is : "+ctable);
		driver.quit();		
		
	}

}
