package utilities;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {
	
	public static void main(String args[]) {
		
		TestNG runn = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\msuser1\\eclipse-workspace\\Practice1\\test-output\\Failed suite [Suite]\\testng-failed.xml");
		runn.setTestSuites(list);
		runn.run();
		
	}
}
