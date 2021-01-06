package pract2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		int a = driver.manage().window().getSize().getWidth();
		int b = driver.manage().window().getSize().getHeight();
		System.out.println("Web Page is at X is : "+x+" & "+"Web Page is at Y is : "+y);
		System.out.println("Web Page Width is : "+a+" & "+"Web Page Height is : "+b);
		driver.quit();
		
	}

}
