package UIStore;

import org.openqa.selenium.By;

public class SigninPageUi {
	
	//Locator to locate email box
			public static By customeremailid = By.id("CustomerEmail");
			
			
			//Locator to locate password box
			public static By customerpass = By.id("CustomerPassword");

			//Locator to locate sign in button
			public static By signinbutton= By.xpath("(//input[@type='submit'])[1]");
			
			//Locator to locate create account button
			public static By createaccount=By.id("customer_register_link");
}
