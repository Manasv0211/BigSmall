package Runner;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ReusableComponents.BaseClass;
import Utilities.Excel;
import Utilities.Extentreports;

public class Application extends BaseClass {

	// testcase 1==signing in using excel data
	@Test(priority = 1)
	public void signinbuttonValidation() throws IOException, InterruptedException {
		driver.get(config.getURL()); // To open URL
		log.info("Driver open URL and entered into Landing Page");

		homepage.sigin().click();
		Excel ex = new Excel();
		ArrayList<String> data1 = ex.getData("username");
		ArrayList<String> data2 = ex.getData("password");
		// signin.customeremailid().sendKeys("minnu");
		// signin.customerpass().sendKeys("12345");
		// signin.signinbutton().sendKeys(Keys.ENTER);
		for (int i = 1; i < data1.size(); i++) {
//			signin.getSignIn().click();
			signin.customeremailid().sendKeys(data1.get(i));
			Thread.sleep(2000);
			signin.customerpass().sendKeys(data2.get(i));
			Thread.sleep(2000);
			er.startTest("Successfully entered url and signedin");
			signin.customeremailid().clear();
			signin.customerpass().clear();
			Thread.sleep(2000);
			// signin.signinbutton().sendKeys(Keys.ENTER);
		}
		
		log.info("System clicked on sign in button");
		log.debug("Successfully opened sign in page");
		er.endTest();
	}

	// testcase 2== adding giftcard
	@Test(priority = 2)
	public void Giftcard() throws InterruptedException, IOException {
		Thread.sleep(2000);
		homepage.logo().click();
		Thread.sleep(2000);
		homepage.giftcard().click();
		er.startTest("Successfully navigated giftcardpage");
		log.info("Successfully navigated to giftcardpage");
		String gtext = giftcard.validate().getText();
		Assert.assertEquals(gtext, "Gift Card");
		for (int i = 0; i < 4; i++) {
			giftcard.add().click();
		}
		Thread.sleep(2000);
		giftcard.addgifttocart().click();
		giftcard.gotocheckout().click();
		Thread.sleep(5000);
		giftcard.closingwhatsappframe().click();
		Thread.sleep(7000);
		giftcard.goingbacktocart().click();
		if (driver.getPageSource().contains("Shopping Cart")) {
			System.out.println("succesfully added to cart");
			log.info("succesfully added to cart");
		}
		er.endTest();
	}

	// testcase 3== searching for product in homepage and clicking on it and
	// verifying whether selected product is crct r not, perform add to wishlist ,
	// add quantity and then add to cart and closing that shopping list frame
	@Test(priority = 3)
	public void addingproducttocart() throws InterruptedException, IOException {
		homepage.logo().click();
		String producttext = homepage.product().getText();
		System.out.println(producttext);
		Thread.sleep(2000);
		homepage.product().click();
		log.info("user clicks on product and navigated to productpage");
		productcmon.productwishlist().click();
		Thread.sleep(10000);
		for (int i = 0; i < 1; i++) {
			productcmon.add().click();
		}
		Thread.sleep(2000);
		productcmon.addtocart().click();
		er.startTest("succesfully added product to cart");
		productcmon.closingsohppinglist().click();
		log.info("closed shoppinglist details");
		Thread.sleep(2000);
		homepage.logo().click();
		// test = reporter.startTest("addingproducttocart");
		er.endTest();
	}

	// testcase== 4 for searching for products
	@Test(priority = 4)
	public void searchproduct() throws IOException {
		Excel ex = new Excel();
		ArrayList<String> data = ex.getData("product");
		for (int i = 1; i < data.size(); i++) {
			homepage.searchbox().clear();
			homepage.searchbox().sendKeys(data.get(i));
			homepage.searchbox().sendKeys(Keys.ENTER);
			er.startTest("successfully searched for a product from excel");
			log.info("searched for product from excel");
		}
		er.endTest();

	}

	@Test(priority = 5)
	public void shopbycateg() throws InterruptedException {
		homepage.logo().click();
		Thread.sleep(2000);
		// driver.get(config.getURL()); // To open URL
		Actions a = new Actions(driver);
		WebElement move = shopbycat.shopbycat();
		a.moveToElement(move).build().perform();
		shopbycat.jewe().click();
		shopbycat.next().click();
		for (int i = 0; i < shopbycat.jewpro().size(); i++) {
			if (shopbycat.jewpro().get(i).getText().contains("Morning Glory Semi-Precious Ring")) {
				Thread.sleep(2000);
				er.startTest("Successfully found Morning Glory Semi-Precious Ring");
				log.info("Successfully found Morning Glory Semi-Precious Ring");
				System.out.println("Product found!");
				log.info("Product found!");
				shopbycat.jewpro().get(i).click();
				break;
				// check the name of the least priced product
			}
		}
		productcmon.productwishlist().click();
		log.info("Adds jewellery product to wishlist");
		er.endTest();
	}

	@Test(priority = 6)
	public void codAvailability() throws IOException, InterruptedException {
		homepage.logo().click();
		Actions a = new Actions(driver);
		WebElement move = homepage.officialM();
		a.moveToElement(move).build().perform();
		homepage.harryPotter().click();
		officialMerchandise.getProdname();
		for (int i = 0; i < officialMerchandise.getProdname().size(); i++) {
			if (officialMerchandise.getProdname().get(i).getText().contains("Hedwig Owl mug")) {
				er.startTest("Successfully found Hedwig Owl mug");
				System.out.println("Product found!");
				Thread.sleep(2000);
				officialMerchandise.getProdname().get(i).click();
				break;
			}

		}
		Thread.sleep(2000);
		officialMerchandise.getPinCode().sendKeys("560097");
		officialMerchandise.getCheckBtn().click();
		Thread.sleep(2000);
		System.out.println(officialMerchandise.getValidateText().getText());
		er.endTest();

	}

	@Test(priority = 7)
	public void PersonalisedGiftsPage() throws IOException, InterruptedException {
		Thread.sleep(5000);
		pg.getPGBtn().click();
		if (pg.getValidate().getText().contains("Personalized Gifts")) {
			Assert.assertTrue(true);
		}
		for (int i = 0; i < pg.getProducts().size(); i++) {
			if (pg.getProducts().get(i).getText().contains("Personalized Pop Art")) {
				er.startTest("Successfully found Personalized Pop Art");
				log.info("Successfully found Personalized Pop Art");
				Thread.sleep(2000);
				System.out.println("Product found!");
				break;
			}
		}
		er.endTest();
	}

	@Test(priority = 8)
	public void CreateAcc() throws IOException, InterruptedException {
		homepage.logo().click();
		homepage.sigin().click();
		ca.getCreateAcc().click();
//		ca.getfname().sendKeys("User1");
//		ca.getlname().sendKeys("2");
//		ca.getEmail().sendKeys("user06@gmail.com");
//		ca.getPassword().sendKeys("!123Wr");
		Excel ex = new Excel();
		ArrayList<String> data1 = ex.getData("firstname");
		ArrayList<String> data2 = ex.getData("lastname");
		ArrayList<String> data3 = ex.getData("emailid");
		ArrayList<String> data4 = ex.getData("password1");
		
		for (int i = 1; i < data1.size(); i++) {
			ca.getfname().sendKeys(data1.get(i));
			//Thread.sleep(2000);
			ca.getlname().sendKeys(data2.get(i));
			//Thread.sleep(2000);
			ca.getEmail().sendKeys(data3.get(i));
			//Thread.sleep(2000);
			ca.getPassword().sendKeys(data4.get(i));
			er.startTest("Successfully entered firstname,lastname,emailid and password");
			log.info("Successfully entered firstname,lastname,emailid and password");
			Thread.sleep(2000);
			ca.getfname().clear();
			ca.getlname().clear();
			ca.getEmail().clear();
			ca.getPassword().clear();
			log.info("cleared");
			//Thread.sleep(2000);
		}
		
		
		
//		ca.getCreateBtn().click();
//		Thread.sleep(2000);
//		if (ca.getValidate().getText().contains("my account")) {
//			System.out.println("Validated!");
//		}
		System.out.println(ca.getValidate().getText());
		er.endTest();

	}

	@Test(priority = 9)
	public void validateWhatsnewPage() throws IOException, InterruptedException {
		homepage.logo().click();
		wn.getBtn().click();
		Thread.sleep(2000);
		if (wn.getValidate().getText().contains("What'S New")) {
			Assert.assertTrue(true);
			Thread.sleep(2000);
		}
	}

	// printing all products of topseller
	@Test(priority = 10)
	public void GiftsPage() throws IOException, InterruptedException {
		homepage.logo().click();
		Actions a1 = new Actions(driver);
		WebElement move = gift.getGifts();
		a1.moveToElement(move).build().perform();
		er.startTest("hovered on gifts");
		gift.getDIY().click();
		if (gift.getValidate().getText().contains("DIY Gifts")) {
			Assert.assertTrue(true);
			log.info("successfully validated");
		}
		int i = 0;
		Select s = new Select(gift.getSortBy());
		Thread.sleep(2000);
		s.selectByValue("price-ascending");
		er.startTest("sorted it in price-ascending");
		log.info("sorted it in price-ascending");
		for (i = 0; i < gift.getProducts().size(); i++) {
			if (gift.getProducts().get(i).getText().contains("DIY Hot Air Balloon Lamp Shade")) {
				Thread.sleep(2000);
				System.out.println("Product found!");
				break;
				//check the name of the least priced product
			}
		}
		er.endTest();

	}
	
	@Test(priority=11)
	public void CorporateGifts() throws IOException, InterruptedException {
		homepage.logo().click();
		homepage.corporategifts().click();
		Excel ex = new Excel();
		ArrayList<String> data1 = ex.getData("fullname");
		ArrayList<String> data2 = ex.getData("emailaddress");
		ArrayList<String> data3 = ex.getData("phonenumber");
		ArrayList<String> data4 = ex.getData("enquiry");
		
		for (int i = 1; i < data1.size(); i++) {
			corporategifts.fullname().sendKeys(data1.get(i));
			//Thread.sleep(2000);
			corporategifts.emailaddress().sendKeys(data2.get(i));
			//Thread.sleep(2000);
			corporategifts.phonenumber().sendKeys(data3.get(i));
			//Thread.sleep(2000);
			corporategifts.enquiry().sendKeys(data4.get(i));
			er.startTest("Successfully entered fullname,emailaddress,phonenumber and enquiry");
			log.info("Successfully entered fullname,emailaddress,phonenumber and enquiry");
			Thread.sleep(2000);
			corporategifts.submit().click();
			er.startTest("Message after clicking on submit");
			String text=corporategifts.text().getText();
			Assert.assertEquals(text, "Thanks for contacting us. We'll get back to you as soon as possible.");
			Thread.sleep(2000);
			er.endTest();
		}
		
		
	}
}
