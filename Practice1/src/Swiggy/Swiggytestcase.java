package Swiggy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swiggytestcase extends Baseclass {
	
	@Test(dataProvider="detailssent")
	public void swiggyRegister(String mobile,String Fname,String email,String pwd) {
		Swiggypom spom = new Swiggypom(driver);
		spom.acctDetails(mobile,Fname,email,pwd);
		
		//PageFcatory
		Swiggypagefactory spfactory = PageFactory.initElements(driver, Swiggypagefactory.class);
		spfactory.acctDetails(mobile,Fname,email,pwd);
	}
	
	@DataProvider(name="detailssent")
	public Object[][] swiggyUser() throws Exception{
		Exceldata edata = new Exceldata("./Test Data/Swiggy.xlsx");
		int rcount = edata.rowCount(0);
		Object[][] obj = new Object[rcount][4];
		for(int i=0;i<rcount;i++) {
			obj[i][0] = edata.udetails(0, i, 0);
			obj[i][1] = edata.udetails(0, i, 1);
			obj[i][2] = edata.udetails(0, i, 2);
			obj[i][3] = edata.udetails(0, i, 3);
		}
		return obj;
	}
	
	
	

}
