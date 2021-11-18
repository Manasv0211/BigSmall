package UIStore;

import org.openqa.selenium.By;

public class CreateAccountUI {

	public static By createAcc = By.xpath("//a[contains(@href,'/account/register')]");
	public static By fname = By.id("FirstName");
	public static By lname = By.id("LastName");
	public static By email = By.id("Email");
	public static By password = By.id("CreatePassword");
	public static By createBtn = By.xpath("//input[contains(@value,'Create')]");
	public static By validate = By.xpath("(//span[contains(@class,'link_text')])[1]");
}
