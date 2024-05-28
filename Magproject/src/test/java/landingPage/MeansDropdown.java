package landingPage;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MeansDropdown extends DriverIntialization{
//verifying the user able select product from mens dropdown available in landing page.
	public static void main(String[] args) throws Exception {
		WebDriver driver =broswerintilizaton();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
//= driver.findElement(By.xpath("//span[text()='Women']"));
Actions act= new Actions(driver);
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();

act.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-17']"))).build().perform();
WebElement HoodiesSweatshirts=driver.findElement(By.xpath("//*[@id=\"ui-id-20\"]/span"));
HoodiesSweatshirts.click();
WebElement pagevalidation=driver.findElement(By.xpath("//span[@class='base' and text()='Hoodies & Sweatshirts']"));
if(pagevalidation.isDisplayed())
{
	System.out.println("User is in Hoodies & Sweatshirts page");
}
else {
	System.out.println("User not  in Hoodies & Sweatshirts page");

}
driver.navigate().back();
act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();

act.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]/span[2]"))).build().perform();
WebElement pants=driver.findElement(By.xpath("//a[@id='ui-id-24']"));
pants.click();
WebElement pagevalidation1=driver.findElement(By.xpath("//span[@class='base' and text()='Shorts']"));
if(pagevalidation1.isDisplayed())
{
	System.out.println("User is in Shorts page");
}
else {
	System.out.println("User not  in Shorts page");

}
	}

}

