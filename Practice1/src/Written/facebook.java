package Written;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		String label = driver.findElement(By.xpath("//label[text()='Email or phone']")).getText();
		/*driver.findElement(By.name("email")).sendKeys("kartheek.gunapati");
		String name = driver.findElement(By.name("email")).getText();
		String fname = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println("Get TEXT : "+name);
		System.out.println("Get ATTRIBUTE : "+fname);
		driver.quit();*/
		System.out.println("Get TEXT : "+label);
		
		driver.quit();
	}

}
