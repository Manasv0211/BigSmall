package UIStore;

import org.openqa.selenium.By;

public class ShopByCatPageUI {
	
	
	public static By shopbycat=By.xpath("//a[@data-dropdown-rel='shop-by-category']");
	public static By jewe=By.xpath("(//a[contains(@href,'/collections/jewellery')])[3]");
	public static By next=By.xpath("//span[@class='next']");
	public static By jewetext=By.xpath("//header[@class='section-header'] //h1[@class='section-header--title h1']");
	public static By jewpro=By.xpath("//div[@class='grid-product__title']");

}
