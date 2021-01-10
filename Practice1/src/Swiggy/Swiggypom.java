package Swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Swiggypom {
	
	WebDriver driver;
	
	public Swiggypom(WebDriver driver) {
		this.driver = driver;
	}
	
	By signin = By.xpath("//a[text()='Sign up']");
	By phone = By.name("mobile");
	By name = By.id("name");
	By email = By.cssSelector("id#email");
	By password = By.name("password");
	By login = By.xpath("//input[text()='CONTINUE']");

	
	public void acctDetails(String mnum,String sname,String mail,String passwd) {
		driver.findElement(signin).click();
		driver.findElement(phone).sendKeys(mnum);
		driver.findElement(name).sendKeys(sname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(login).click();
	}
	
}
