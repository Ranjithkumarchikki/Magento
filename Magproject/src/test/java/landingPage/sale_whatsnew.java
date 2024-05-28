package landingPage;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sale_whatsnew extends DriverIntialization{
//verifying the user able select product from Training sale_whatsnew available in landing page.
	public static void main(String[] args) throws Exception {
		WebDriver driver =broswerintilizaton();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		

Actions act= new Actions(driver);
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.xpath("//a[@id=\"ui-id-8\"]"))).click().build().perform();


WebElement pagevalidation=driver.findElement(By.xpath("//span[@class='base' and text()='Sale']"));
if(pagevalidation.isDisplayed())
{
	System.out.println("User is in Sale page");
}
else {
	System.out.println("User not  in Sale  page");

}
driver.navigate().back();
act.moveToElement(driver.findElement(By.xpath("//a[@id=\"ui-id-3\"]"))).click().build().perform();
WebElement pagevalidation1=driver.findElement(By.xpath("//span[@class='base']"));
if(pagevalidation1.isDisplayed())
{
	System.out.println("User is in What's New page");
}
else {
	System.out.println("User not  in What's New  page");

}
	}
}

