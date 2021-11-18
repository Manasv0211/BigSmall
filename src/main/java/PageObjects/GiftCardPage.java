package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.GiftCardPageUI;

public class GiftCardPage {

	WebDriver driver;

	public GiftCardPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement pricelist() {
		return driver.findElement(GiftCardPageUI.pricelist);
	}

	public WebElement addgifttocart() {
		return driver.findElement(GiftCardPageUI.addgifttocart);
	}

	public WebElement quantity() {
		return driver.findElement(GiftCardPageUI.quantity);
	}

	public WebElement giftwishlist() {
		return driver.findElement(GiftCardPageUI.giftwishlist);
	}

	public WebElement validate() {
		return driver.findElement(GiftCardPageUI.validate);
	}

	public WebElement add() {
		return driver.findElement(GiftCardPageUI.add);
	}

	public WebElement gotocheckout() {
		return driver.findElement(GiftCardPageUI.gotocheckout);
	}

	public WebElement whatsapptext() {
		return driver.findElement(GiftCardPageUI.whatsapptext);
	}
	public WebElement closingwhatsappframe() {
		return driver.findElement(GiftCardPageUI.closingwhatsappframe);
	}
	public WebElement goingbacktocart() {
		return driver.findElement(GiftCardPageUI.goingbacktocart);
	}

}
