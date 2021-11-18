package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.ShopByCatPageUI;



public class ShopByCatPage {
	
	WebDriver driver;
	
	public ShopByCatPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement shopbycat() {
		return driver.findElement(ShopByCatPageUI.shopbycat);
	}
	public WebElement jewe() {
		return driver.findElement(ShopByCatPageUI.jewe);
	}
	public WebElement next() {
		return driver.findElement(ShopByCatPageUI.next);
	}
	public WebElement jewetext() {
		return driver.findElement(ShopByCatPageUI.jewetext);
	}
	public List<WebElement> jewpro() {
		return driver.findElements(ShopByCatPageUI.jewpro);
	}

}
