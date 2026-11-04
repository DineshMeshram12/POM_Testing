package LoginPage;

import java.io.FileInputStream;
import java.util.Properties;


public class ConfigReader {
	 Properties prop;


public ConfigReader() {
	try {
		FileInputStream file = new FileInputStream("src/test/resources/config.properties");
		prop = new Properties();
		prop.load(file);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
	public String getUrl() {
		return prop.getProperty("Url");
	}
	
	  public String getBrowser() {
	        return prop.getProperty("browser");
	    }

	    public String getUsername() {
	        return prop.getProperty("username");
	    }

	    public String getPassword() {
	        return prop.getProperty("password");
	    }
	
}
