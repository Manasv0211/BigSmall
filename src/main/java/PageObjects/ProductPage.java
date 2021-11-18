package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import UIStore.ProductPageUI;

public class ProductPage {
	WebDriver driver;
	
	
	public ProductPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}


	public WebElement productwishlist() {
		return driver.findElement(ProductPageUI.productwishlist);
	}
	public WebElement addtocart() {
		return driver.findElement(ProductPageUI.addtocart);
	}
	public WebElement quantity() {
		return driver.findElement(ProductPageUI.quantity);
	}
	public WebElement add() {
		return driver.findElement(ProductPageUI.add);
	}
	public WebElement closingsohppinglist() {
		return driver.findElement(ProductPageUI.closingsohppinglist);
	}

}
