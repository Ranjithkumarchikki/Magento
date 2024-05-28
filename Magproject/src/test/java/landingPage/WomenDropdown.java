package landingPage;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenDropdown extends DriverIntialization{
//verifying the user able select product from womens dropdown available in landing page.
	public static void main(String[] args) throws Exception {
		WebDriver driver =broswerintilizaton();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
//= driver.findElement(By.xpath("//span[text()='Women']"));
Actions act= new Actions(driver);
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).build().perform();

act.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-9']"))).build().perform();
WebElement jackets=driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]/span"));
jackets.click();
WebElement pagevalidation=driver.findElement(By.xpath("//span[@class='base' and text()='Jackets']"));
if(pagevalidation.isDisplayed())
{
	System.out.println("User is in jockets page");
}
else {
	System.out.println("User not  in jockets page");

}
driver.navigate().back();
act.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).build().perform();

act.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"))).build().perform();
WebElement pants=driver.findElement(By.xpath("//a[@id='ui-id-15']"));
pants.click();
WebElement pagevalidation1=driver.findElement(By.xpath("//span[@class='base' and text()='Pants']"));
if(pagevalidation1.isDisplayed())
{
	System.out.println("User is in Pants page");
}
else {
	System.out.println("User not  in Pants page");

}
	}

}
