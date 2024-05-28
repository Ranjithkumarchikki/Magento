package landingPage;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TraningDropdown extends DriverIntialization{
//verifying the user able select product from Training dropdown available in landing page.
	public static void main(String[] args) throws Exception {
		WebDriver driver =broswerintilizaton();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		

Actions act= new Actions(driver);
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//span[text()='Training']"))).build().perform();

 act.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-28']"))).click().build().perform();

WebElement pagevalidation=driver.findElement(By.xpath("//span[@class='base' and text()='Video Download']"));
if(pagevalidation.isDisplayed())
{
	System.out.println("User is in Video Download page");
}
else {
	System.out.println("User not  in Video Download page");

}}
}