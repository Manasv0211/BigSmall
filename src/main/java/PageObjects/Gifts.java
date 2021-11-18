package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.GiftsUI;

public class Gifts {

	WebDriver driver;

	public Gifts(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getValidate() {
		return driver.findElement(GiftsUI.validate);

	}

	public WebElement getSortBy() {
		return driver.findElement(GiftsUI.sortBy);

	}

	public WebElement getGifts() {
		return driver.findElement(GiftsUI.gifts);

	}

	public WebElement getDIY() {
		return driver.findElement(GiftsUI.diy);

	}

	public List<WebElement> getProductsPrice() {
		return driver.findElements(GiftsUI.prodPrice);

	}

	public List<WebElement> getProducts() {
		return driver.findElements(GiftsUI.Products);

	}
}
