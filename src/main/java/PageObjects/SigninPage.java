package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.HomePageUI;
import UIStore.SigninPageUi;

public class SigninPage {
	WebDriver driver;

	public SigninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement customeremailid() {
		return driver.findElement(SigninPageUi.customeremailid);
	}
	public WebElement customerpass() {
		return driver.findElement(SigninPageUi.customerpass);
	}
	public WebElement signinbutton() {
		return driver.findElement(SigninPageUi.signinbutton);
	}
	public WebElement createaccount() {
		return driver.findElement(SigninPageUi.createaccount);
	}
	
	
	
	

}
