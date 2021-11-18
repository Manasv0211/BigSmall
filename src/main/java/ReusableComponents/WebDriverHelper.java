package ReusableComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {

	
	public static WebDriver driverInitializer(WebDriver driver, String browserName, int implicitWait) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else {
			System.out.println("Unable to run with Mentioned browser");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS); 	//Implicit Wait in given in seconds

		return driver;
	}
	public static void quitDriver(WebDriver driver) {
		driver.close();
		driver = null;
	}
}

