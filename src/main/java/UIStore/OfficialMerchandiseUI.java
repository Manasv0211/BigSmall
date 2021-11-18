package UIStore;

import org.openqa.selenium.By;

public class OfficialMerchandiseUI {

	public static By prodName = By.xpath("(//div[contains(@class,'grid-product__title')])");
	public static By pinCode = By.xpath("(//input[contains(@placeholder,'Enter Pincode')])");
	public static By check = By.xpath("(//button[contains(@class,'codbutton btn button')])");
	public static By text = By.xpath("(//p[contains(@id,'PostalCodeCheckerAvailability')])");
}
