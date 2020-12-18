package Windows;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configfile1 {
	
	Properties pro;
	
	public Configfile1() throws Exception {
		File src = new File("./Configuration/config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChormeDriver");
		return chrome;
	}
	
	public String getFlipkart() {
		String filpkart = pro.getProperty("FlipkartUrl");
		return filpkart;
	}

	

}
