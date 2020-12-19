package YahooDDTesting;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configfile01 {
	
	Properties pro;
	
	public void fileOperation() throws Exception {
		File src = new File("./Configuration/config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChormeDriver");
		return chrome;
	}
	
	public String getFirefox() {
		String firefox = pro.getProperty("FirefoxDriver");
		return firefox;
	}
	
	public String getYahoo() {
		String yahoo = pro.getProperty("FYahooUrl");
		return yahoo;
	}

}
