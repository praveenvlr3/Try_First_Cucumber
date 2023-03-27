 package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationManager {
	
	public Properties ps = new Properties();
	
	// Default constructor - (Class name & Method name is same)
	public ConfigurationManager() throws Throwable {
		
		// To get the path of Config pro path user.dir (System location - it may change system to system) + config properties path
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Properties\\Config.properties"); 
	
		 // Read the config properties file
		FileInputStream fips = new FileInputStream(file);

		ps.load(fips);
	}
	public String getUrl() {
		String property = ps.getProperty("url");
		return property;	 
	}
	
	public String getBrowser() {
		String property = ps.getProperty("browser");
		return property;	 
	}
}
