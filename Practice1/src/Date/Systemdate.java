package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.configfile;

public class Systemdate {
	
	public static void main(String args[]) throws Exception {
		
		configfile config = new configfile();
		
		System.setProperty("webdriver.chrome.driver",config.getChrome());	
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension(2500,2500);
		driver.manage().window().maximize();
		driver.manage().window().setSize(d);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DateFormat dformate = new SimpleDateFormat("MM:dd:yy HH:mm:ss");
		Date date = new Date();
		String date1 = dformate.format(date);
		System.out.println("Current System Date is : "+date1);
		driver.quit();
		
		
		
		
		
	}

}
