package YahooDDTesting;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yahootestcases extends Baseclass {
	
	
	@Test(dataProvider="ydetails")
	public void yahooRegister(String fname,String sname,String mail,String pwd,String mnum,String mon, String day1,String year1,String gder) {
		Pom1 pom = new Pom1(driver);
		pom.acctdetails(fname, sname, mail, pwd, mnum, mon, day1, year1, gder);
		Pagefactory p1 = PageFactory.initElements(driver, Pagefactory.class);
		p1.acctdetails(fname, sname, mail, pwd, mnum, mon, day1, year1, gder);
		Reporter.log("Multile User Registration Done Successfully");
	}
	
	
	@DataProvider(name="ydetails")
	public Object[][] fillDetails() throws Exception{
		
		Exceloperation ecpt = new Exceloperation("C:\\Users\\msuser1\\eclipse-workspace\\DataDriven\\TestData\\Yahoo Acct Details.xlsx");
		int rcount = ecpt.getCount(0);
		System.out.println("Total number of Counts : "+rcount);
		Object[][] obj = new Object[rcount][9];
		for(int i=0; i<rcount; i++) {
			obj[i][0] = ecpt.yahooData(0, i, 0);
			obj[i][1] = ecpt.yahooData(0, i, 1);
			obj[i][2] = ecpt.yahooData(0, i, 2);
			obj[i][3] = ecpt.yahooData(0, i, 3);
			obj[i][4] = ecpt.yahooData(0, i, 4);
			obj[i][5] = ecpt.yahooData(0, i, 5);
			obj[i][6] = ecpt.yahooData(0, i, 6);
			obj[i][7] = ecpt.yahooData(0, i, 7);
			obj[i][8] = ecpt.yahooData(0, i, 8);
		}
		return obj;
	}

}
