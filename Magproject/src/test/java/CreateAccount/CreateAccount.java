package CreateAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import landingPage.DriverIntialization;

public class CreateAccount extends DriverIntialization {

	public static void main(String[] args) {
		WebDriver driver=broswerintilizaton();
		PageFactory.initElements(driver, Base.class);
Base.createaccount.click();
Base.FirstName.sendKeys("chikki");
Base.LaastName.sendKeys("thalli");
Base.Email.sendKeys("yonila4533@fincainc.com");
Base.password.sendKeys("Ranjithkumar@30");
Base.Conformpassword.sendKeys("Ranjithkumar@30");
Base.Submit.click();
try {
if(Base.confirmation.isDisplayed())
{
	System.out.println("User registred sucessfully");
}
else {
	System.out.println("User registation failed");
}
}
catch(Exception e)
{
	String message=Base.validationMessage.getText();
	System.out.println(message);
}
	}

}
