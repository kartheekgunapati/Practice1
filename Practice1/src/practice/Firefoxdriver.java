package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.close();
		
	}

}
