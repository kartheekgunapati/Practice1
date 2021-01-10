package Swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Swiggypagefactory {
	
	WebDriver driver;
	
	public Swiggypagefactory(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Sign up']") WebElement signin;
	@FindBy(name="mobile") WebElement phone;
	@FindBy(how=How.NAME,using="name") WebElement name;
	@FindBy(id="email") WebElement email;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(xpath="//input[text()='CONTINUE']") WebElement login;
	
	public void acctDetails(String mobnum,String sname,String mail,String passwd) {
		signin.click();
		phone.sendKeys(mobnum);
		name.sendKeys(sname);
		email.sendKeys(mail);
		password.sendKeys(passwd);
		login.click();
	}

}
