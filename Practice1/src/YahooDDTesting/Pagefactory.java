package YahooDDTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Pagefactory {
	
	WebDriver driver;
	public Pagefactory(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Sign in']") WebElement signin;
	@FindBy(name="createacc") WebElement createacct;
	@FindBy(how=How.NAME,using="firstName") WebElement firstname;
	@FindBy(name="lastName") WebElement lastname;
	@FindBy(how=How.NAME,using="yid") WebElement emailid;
	@FindBy(name="password") WebElement password;
	@FindBy(how=How.NAME,using="phone") WebElement phone;
	@FindBy(name="mm") WebElement month;
	@FindBy(how=How.NAME,using="dd") WebElement day;
	@FindBy(name="yyyy") WebElement year;
	@FindBy(how=How.NAME,using="freeformGender") WebElement gender;
	
	public void acctdetails(String first,String sur,String email,String pass,String mobile,String mmm, String ddd,String yyy,String gendr) {
		signin.click();
		createacct.click();
		firstname.sendKeys(first);
		lastname.sendKeys(sur);
		emailid.sendKeys(email);
		password.sendKeys(pass);
		phone.sendKeys(mobile);
		Select s = new Select(month);
		s.selectByVisibleText(mmm);
		day.sendKeys(ddd);
		year.sendKeys(yyy);
		gender.sendKeys(gendr);
		
	}
	

}
