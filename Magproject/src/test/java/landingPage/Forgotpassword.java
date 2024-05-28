package landingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword extends DriverIntialization {
	static WebDriver driver= broswerintilizaton();
	public static void main(String[] args) {
		
	
	WebElement signup= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
	signup.click();
 
WebElement forgotpassword=driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a"));
forgotpassword.click();
WebElement fogemail=driver.findElement(By.id("email_address"));
fogemail.sendKeys("bajeko1352@cgbird.com");
WebElement resetpassword=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
resetpassword.click();
WebElement validationtag=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"));
if(validationtag.isDisplayed())
{
	System.out.println("you will get reset link");
}
else
{
	System.out.println("you will not get reset link");
 
}
}}
