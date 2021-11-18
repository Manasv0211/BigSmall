package UIStore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	
	//Locator to locate the SearchBox in the HomePage
		public static By whatsnew = By.xpath("//div[@class='main-banner'] //button[@class='btn btn-default']");
		
		//Locator to locate the searchButton in the HomePage
		public static By searchbox = By.xpath("//form[@class='search-bar'] //input[@type='search']");
		
		
		//Locator to locate signing
		public static By sigin=By.xpath("//div[@class='site-nav__icons'] //i[contains(@class,'fa fa-user')]");
		
		//Locator to locate wishlist
		public static By wishlist = By.xpath("//div[@class='site-nav__icons'] //i[contains(@class,'fa fa-heart')]");
		
		//Locator to locate giftcard
		public static By giftcard = By.xpath("//div[@class='site-nav__icons'] //i[contains(@class,'fa fa-gift')]");
		
		//Locator to locate the addtocart
		public static By cart = By.xpath("//div[@class='site-nav__icons'] //img[contains(@class,'carticonimage')]");
		
		public static By product = By.xpath("//div[contains(text(),'Bulb Curtain LED Lights')]");
	
		public static By logo = By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[1]/div/a[1]/img[1]");
	
		public static By producttextafterclicking=By.xpath("//*[@id=\"ProductSection-7044608557254\"]/div/div/div[1]/div[2]/div/div[1]/h1");
		
		public static By shopbycategory=By.xpath("//a[@data-dropdown-rel='shop-by-category']");
		
		public static By gifts=By.xpath("\"(//a[contains(@href,'/collections/unique-gifts')])[2]");
		
		public static By officialMerchandise = By.xpath("(//a[contains(@data-dropdown-rel,'official-merchandise')])");

		public static By HarryPottergift = By.xpath("(//a[contains(@href,'/collections/harry-potter-merchandise')])[2]");
		
		public static By topsellers=By.xpath("//header[contains(@class,'section-header aos-init aos-animate')]");
		
		public static By topsellergrid=By.xpath("//div[@class='grid__item grid-product grid-product--small aos-init aos-animate']");
}
//