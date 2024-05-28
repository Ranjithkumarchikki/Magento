package landingPage;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GearDropdown extends DriverIntialization{
//verifying the user able select product from gear dropdown available in landing page.
	public static void main(String[] args) throws Exception {
		WebDriver driver =broswerintilizaton();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
//= driver.findElement(By.xpath("//span[text()='Women']"));
Actions act= new Actions(driver);
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//span[text()='Gear']"))).build().perform();

 act.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-25']"))).click().build().perform();

WebElement pagevalidation=driver.findElement(By.xpath("//span[@class='base' and text()='Bags']"));
if(pagevalidation.isDisplayed())
{
	System.out.println("User is in Bags page");
}
else {
	System.out.println("User not  in Bags page");

}
driver.navigate().back();
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//span[text()='Gear']"))).build().perform();
act.moveToElement(driver.findElement(By.xpath("//a[@id=\"ui-id-26\"]"))).click().build().perform();

WebElement pagevalidation1=driver.findElement(By.xpath("//span[@class='base' and text()='Fitness Equipment']"));
if(pagevalidation1.isDisplayed())
{
	System.out.println("User is in Fitness Equipment page");
}
else {
	System.out.println("User not  in Fitness Equipment page");

}
driver.navigate().back();
act.moveToElement(driver.findElement(By.xpath("//span[text()='Gear']"))).build().perform();

act.moveToElement(driver.findElement(By.xpath("//a[@id=\"ui-id-27\"]"))).click().build().perform();

WebElement pagevalidation2=driver.findElement(By.xpath("//span[@class='base' and text()='Watches']"));
if(pagevalidation2.isDisplayed())
{
	System.out.println("User is in Watches page");
}
else {
	System.out.println("User not  in Watches page");

}
	}

}


