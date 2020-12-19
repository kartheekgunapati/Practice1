package YahooDDTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pom1 {
	
	WebDriver driver;
	
	public Pom1(WebDriver driver) {
		this.driver = driver;
	}
	
	By signin = By.xpath("//span[text()='Sign in']");
	By creatact = By.id("createacc");
	By firstname = By.name("firstName");
	By surname = By.name("lastName");
	By emailId = By.name("yid");
	By password = By.name("password");
	By mobilenumber = By.name("phone");
	By month = By.name("mm");
	By day = By.name("dd");
	By year = By.name("yyyy");
	By gender = By.name("freeformGender");
	
	
	public void acctdetails(String first,String sur,String email,String pass,String mobile,String mmm, String ddd,String yyy,String gendr) {
		driver.findElement(signin).click();
		driver.findElement(creatact).click();
		driver.findElement(firstname).sendKeys(first);
		driver.findElement(surname).sendKeys(sur);
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(mobilenumber).sendKeys(mobile);
		WebElement e1 = driver.findElement(month);
		Select s = new Select(e1);
		s.selectByVisibleText(mmm);
		driver.findElement(day).sendKeys(ddd);
		driver.findElement(year).sendKeys(yyy);
		driver.findElement(gender).sendKeys(gendr);
		
	}

}
