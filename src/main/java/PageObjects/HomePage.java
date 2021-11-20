package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.HomePageUI;




public class HomePage {
	
	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver) {   //Mapping driver to the driver which is currently working on using constructor 
		this.driver = driver;
	}
	
	ArrayList<String> productlist = new ArrayList<String>();
	
	//Used to search an item in search field
	public void searchItem(String itemName) {  
		searchbox().sendKeys(itemName);
		searchbox().sendKeys(Keys.ENTER);;
		
	}
	
	// Returns various WebElements for the defined locators
		public WebElement Whatsnew() {
			return driver.findElement(HomePageUI.whatsnew);
		}
		public WebElement searchbox() {
			return driver.findElement(HomePageUI.searchbox);
		}
		public WebElement sigin() {
			return driver.findElement(HomePageUI.sigin);
		}
		public WebElement wishlist() {
			return driver.findElement(HomePageUI.wishlist);
		}
		public WebElement giftcard() {
			return driver.findElement(HomePageUI.giftcard);
		}
		public WebElement cart() {
			return driver.findElement(HomePageUI.cart);
		}
		public WebElement product() {
			return driver.findElement(HomePageUI.product);
		}
		public WebElement logo() {
			return driver.findElement(HomePageUI.logo);
		}
		public WebElement producttextafterclicking() {
			return driver.findElement(HomePageUI.producttextafterclicking);
		}
		public WebElement officialM() {
			return driver.findElement(HomePageUI.officialMerchandise);
		}

		public WebElement harryPotter() {
			return driver.findElement(HomePageUI.HarryPottergift);
		}
		
		public WebElement corporategifts() {
			return driver.findElement(HomePageUI.corporategifts);
		}
		
		
		
		
}
