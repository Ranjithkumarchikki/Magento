package CreateAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base {
	
	@FindBy(xpath = "//a[text()='Create an Account']")
	public static WebElement createaccount;
	@FindBy(id="firstname")
	public static WebElement FirstName;
	@FindBy(id="lastname")
	public static WebElement LaastName;
	@FindBy(xpath = "//input[@name='email' and @id='email_address']")
	public static WebElement Email;
	@FindBy(xpath = "//input[@name='password' and @id='password']")
	public static WebElement password;
	@FindBy(xpath = "//input[@name='password_confirmation']")
	public static WebElement Conformpassword;
	@FindBy(xpath ="//button[@title='Create an Account' and @type='submit']")
	public static WebElement Submit;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	public static WebElement confirmation;
	@FindBy (xpath = "//div[@class='page messages']/child::div[2]/descendant::div[3]")
	public static WebElement validationMessage;
}
