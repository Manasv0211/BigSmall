package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.CorporateGiftsUI;

public class CorporateGifts {
	
	WebDriver driver;
	public CorporateGifts(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement fullname() {
		return driver.findElement(CorporateGiftsUI.fullname);
	}
	public WebElement emailaddress() {
		return driver.findElement(CorporateGiftsUI.emailaddress);
	}
	public WebElement phonenumber() {
		return driver.findElement(CorporateGiftsUI.phonenumber);
	}
	public WebElement enquiry() {
		return driver.findElement(CorporateGiftsUI.enquiry);
	}
	public WebElement submit() {
		return driver.findElement(CorporateGiftsUI.submit);
	}
	public WebElement text() {
		return driver.findElement(CorporateGiftsUI.text);
	}

}
