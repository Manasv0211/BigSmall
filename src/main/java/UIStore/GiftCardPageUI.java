package UIStore;

import org.openqa.selenium.By;

public class GiftCardPageUI {

	
	public static By pricelist = By.xpath("// fieldset[@class='variant-input-wrap']");
	public static By addgifttocart = By.xpath("//button[@name='add']");
	public static By quantity = By.xpath("//input[@class='js--num']");
	public static By giftwishlist = By.linkText("Add to Wishlist");
	public static By validate=By.xpath("//h1[contains(@class,'h1 product-single__title')]");
	public static By add=By.xpath("//span[contains(@class,'js--qty-adjuster js--add')]");
	public static By gotocheckout = By.xpath("//button[contains(@name,'checkout')]");
	public static By whatsapptext = By.xpath("(//div[@class='wa-optin-widget-title-container'] //span[@class='wa-optin-widget-title-text'])[1]");
	public static By closingwhatsappframe = By.xpath("//div[@class='wa-optin-widget-close-btn']");
	public static By goingbacktocart = By.xpath("//a[@class='breadcrumb__link']");

	
	
	
	
}
