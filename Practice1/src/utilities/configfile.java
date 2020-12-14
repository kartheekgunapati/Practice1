package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configfile {
	
	Properties pro;
	
	public configfile() throws Exception {
		
		File src = new File("C:\\Users\\msuser1\\eclipse-workspace\\Practice1\\Configuration\\config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChormeDriver");
		return chrome;
	}
	
	public String getFirefox() {
		String fire = pro.getProperty("FirefoxDriver");
		return fire;
	}
	
	public String getFb() {
		String fb = pro.getProperty("FBUrl");
		return fb;
	}
	
	public String getGoogle() {
		String google = pro.getProperty("GoogleUrl");
		return google;
	}
	
	public String getFilpkart() {
		String filpkart = pro.getProperty("FlipkartUrl");
		return filpkart;
	}
}
