package ReusableComponents;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;



import com.relevantcodes.extentreports.ExtentTest;

import PageObjects.CorporateGifts;
import PageObjects.CreateAccount;
import PageObjects.GiftCardPage;
import PageObjects.Gifts;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import PageObjects.ShopByCatPage;
import PageObjects.SigninPage;
import PageObjects.WhatsNew;
import PageObjects.OfficialMerchandise;
import PageObjects.PersonalisedGifts;
import Utilities.ConfigsProvider;
//import Utilities.ExtentReporter;
import Utilities.Extentreports;



public class BaseClass {
	
	public static WebDriver driver;
	public static Logger log;
	public static ConfigsProvider config;
	//public static ExtentReports reporter;
	public static ExtentTest test;
	public static Extentreports er;
	public static OfficialMerchandise officialMerchandise;
	public static HomePage homepage;
	public static SigninPage signin;
	public static GiftCardPage giftcard;
	public static ProductPage productcmon;
	public static ShopByCatPage shopbycat;
	public static PersonalisedGifts pg;
	public static CreateAccount ca;
	public static WhatsNew wn;
	public static Gifts gift;
	public static CorporateGifts corporategifts;
	
	@BeforeSuite
	public void startup() throws IOException {
		
		log = Logger.getLogger(getClass());
		config = new ConfigsProvider();
//		reporter = new ExtentReporter(config.getExtentPath());
//		test = reporter.startTest("HomePage");
	}
	@BeforeClass
	public void beforeClass() {
		driver = WebDriverHelper.driverInitializer(driver, config.getBrowser(), config.implicitWait());
		log.info("Driver Initialised");
		 er = new Extentreports(driver);
		
		homepage = new HomePage(driver);
		signin = new SigninPage(driver);
		giftcard=new GiftCardPage(driver);
		productcmon=new ProductPage(driver);
		shopbycat=new ShopByCatPage(driver);
		officialMerchandise=new OfficialMerchandise(driver);
		pg=new PersonalisedGifts(driver);
		ca=new CreateAccount(driver);
		wn=new WhatsNew(driver);
		gift=new Gifts(driver);
		corporategifts=new CorporateGifts(driver);
		
	}
	
	
	@AfterClass
	public void classTeardown() {
		WebDriverHelper.quitDriver(driver);
		log.info("Driver Closed");
	}
//	@AfterSuite
//	public void suiteTeardown() {
//		reporter.endTest(test);
//		reporter.close();
//	}
}
