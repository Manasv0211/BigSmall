package UIStore;

import org.openqa.selenium.By;

public class PersonalisedGiftsUI {

	public static By personalisedBtn = By.xpath("(//a[contains(@data-dropdown-rel,'personalized-gifts')])");
	public static By validate = By
			.xpath("(//header[contains(@class,'section-header')]) //h1[contains(@class,'section-header--title h1')]");
	public static By prodName = By.xpath("(//div[contains(@class,'grid-product__title')])");

}
