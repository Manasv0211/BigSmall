package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigsProvider {

	static Properties props = new Properties();
	
	public ConfigsProvider() {
		File configFilePath = new File("./TestData/config.properties");
		FileInputStream configFile;
		try {
			configFile = new FileInputStream(configFilePath);
			props.load(configFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}

	public String getBrowser() {
		return props.getProperty("browser");
	}
	public String getURL() {
		return props.getProperty("url");
	}
	public String getExtentPath() {
		return props.getProperty("extentReportPath");
	}
	public String getDriverPath() {
		return props.getProperty("driverPath");
	}
	public int implicitWait() {
		return Integer.parseInt(props.getProperty("implicitWait"));
	}
}