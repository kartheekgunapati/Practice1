package Testassemen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void case1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\msuser1\\Documents\\Workspace\\Celin\\Cha\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.findElement(By.xpath("//button[text()='Submit Form']")).click();
		List<WebElement> list1 = driver.findElements(By.tagName("label"));
		int a = list1.size();
		System.out.println("Size of the list is : "+a);
		for(int i=0; i<a;i++) {
			String lablename = list1.get(i).getText();
			System.out.println("Lable Name is :"+lablename);
		}
		
	}
	
	@Test(priority=2)
	public void softAssert() {
		List<WebElement> list2 = driver.findElements(By.tagName("input"));
		int b = list2.size();
		System.out.println("Size of the list is : "+b);
		for(int i=0;i<b;i++) {
			boolean cond1 = list2.get(i).isDisplayed();
			SoftAssert ast = new SoftAssert();
			ast.assertTrue(cond1);
			ast.assertAll();
		}
		
	}
	
	@Test(priority=3)
	public void hardAssert() {
		List<WebElement> list3 = driver.findElements(By.tagName("input"));
		int c = list3.size();
		System.out.println("Size of the list is : "+c);
		for(int i=0;i<c;i++) {
			boolean cond2 = list3.get(i).isDisplayed();
			Assert.assertTrue(cond2);
		}	
	}
	
	@Test(priority=4)
	public void fillDetails() {
		driver.findElement(By.xpath("//div[@id='fnameInput']")).sendKeys("Karthik");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Karthick.gunapati@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9493517466");
		driver.findElement(By.xpath("//div[@id='positionInput']")).sendKeys("Automation Test Engineer");
		driver.findElement(By.xpath("//input[@type='salaryInput']")).sendKeys("As Per Market standards");
		driver.findElement(By.xpath("//div[@id='lnameInput']")).sendKeys("Gunapati");
		driver.findElement(By.xpath("//div[@id='curCompanyInput']")).sendKeys("Mahaswami Software Pvt Ltd");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[7]")).click();
		String protofie = "https://www.linkedin.com/in/karthik-reddy-gunapati-30185bb1/";
		driver.findElement(By.xpath("//div[@id='portfolioInput']")).sendKeys(protofie);
		driver.findElement(By.xpath("//div[@id='resumeInput']")).sendKeys("C:\\Users\\msuser1\\Downloads\\Images\\Quotes\\Karthik 3+ years of Experience.pdf");
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//button[text()='Submit Form']")).click();
	
	}
	
	/*@Test(priority=5)
	public void dbConnect() {
		class.forName("com.mysql.jdbc.driver")
		Connection con = DriverManager.getConnection("url","username","password");
		Statement st = con.createStatement();
		Result rs = st.executeQuerry("Select * from table where First Name ='Karthik'");
		while(rs.hasNext()){
			String name = rs.next();
			System.out.println(name);
			if(name.equalsIgnoreCase("Karthik")) {
				System.out.println("Data Stored in DB Successfully");
			}
		}
	}*/
	
	
	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
