package Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.configfile;

public class Windows1 {
	
	public static void main(String args[]) throws Exception {
		configfile config = new configfile();
		System.setProperty("webdriver.chrome.driver", config.getChrome());
		WebDriver driver = new ChromeDriver();
		driver.get(config.getFilpkart());
	}
	
	

}
