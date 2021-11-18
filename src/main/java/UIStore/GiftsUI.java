package UIStore;

import org.openqa.selenium.By;

public class GiftsUI {

	public static By gifts = By.xpath("(//a[contains(@href,'/collections/unique-gifts')])[2]");
	public static By diy = By.xpath("(//a[contains(@href,'/collections/diy-gifts')])[2]");
	public static By validate = By
			.xpath("(//header[contains(@class,'section-header')]) //h1[contains(@class,'section-header--title h1')]");
	public static By sortBy = By.id("sortBy");

	public static By prodPrice = By
			.xpath("(//div[contains(@class,'grid-product__price')]) //span[contains(@class,'money')]");
	public static By Products = By.xpath("(//div[contains(@class,'grid-product__title')])");
}
