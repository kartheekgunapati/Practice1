package Swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	Properties pro;
	
	public Config() throws Exception {
		File src = new File("./Configuration/config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getSwiggy() {
		String swiggyurl = pro.getProperty("SwiggyUrl");
		return swiggyurl;
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChormeDriver");
		return chrome;
	}
	
	public String getFirefox() {
		String firefox = pro.getProperty("FirefoxDriver");
		return firefox;
	}

}
