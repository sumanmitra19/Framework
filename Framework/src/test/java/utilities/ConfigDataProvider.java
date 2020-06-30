package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Config file is not loaded and the Exception message is: " + e.getMessage());
		}
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStagingURL()
	{
		return pro.getProperty("browserUrl");
	}
	
	public String getUsername()
	{
		return pro.getProperty("unm");
	}
	
	public String getPassword()
	{
		return pro.getProperty("pwd");
	}
	
}
