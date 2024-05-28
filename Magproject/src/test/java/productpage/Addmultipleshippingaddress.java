package productpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import landingPage.DriverIntialization;

public class Addmultipleshippingaddress extends DriverIntialization {
	static WebDriver driver= broswerintilizaton();
	public static void MUltiple1() throws InterruptedException {
		
		Actions act= new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();

		act.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-17']"))).build().perform();
		WebElement HoodiesSweatshirts=driver.findElement(By.xpath("//*[@id=\"ui-id-20\"]/span"));
	HoodiesSweatshirts.click();
	WebElement selectProduct=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
	selectProduct.click();
	}
	public static void main(String[] args) throws InterruptedException {
		
	
	//AddToCompare.AddtoCompare1();
		Addmultipleshippingaddress.MUltiple1();
		
	Thread.sleep(2000);
WebElement size=driver.findElement(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div[@id='option-label-size-143-item-166']"));
size.click();
WebElement color=driver.findElement(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div[@id='option-label-color-93-item-50']"));
color.click();
WebElement addtocartbutton=driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
addtocartbutton.click();
Thread.sleep(2000);
WebElement shoppingcartbutton=driver.findElement(By.xpath("//a[text()='shopping cart']"));

driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
if(shoppingcartbutton.isDisplayed())
{
	System.out.println("product added sucessfully");
}
else {
	System.out.println("product not added sucessfully");

}
shoppingcartbutton.click();
WebElement checkoutwithmultipleAddress=driver.findElement(By.xpath("//a[@class=\"action multicheckout\"]"));
checkoutwithmultipleAddress.click();
WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys("yonila4533@fincainc.com");
WebElement password=driver.findElement(By.xpath("//input[@id='pass' and @title='Password']"));
password.sendKeys("Ranjithkumar@30");
WebElement signIn=driver.findElement(By.xpath("//div[@class='actions-toolbar'][1]/child::div[@class='primary']/child::button[@class='action login primary']/child::span[text()='Sign In']"));
signIn.click();
WebElement phonenumber=driver.findElement(By.xpath("//input[@id=\"telephone\"]"));
phonenumber.sendKeys("1234567891");
	WebElement street=driver.findElement(By.xpath("//*[@id=\"street_1\"]"));
	street.sendKeys("hno 1-2-30");
	WebElement city=driver.findElement(By.xpath("//input[@id=\"city\"]"));
	city.sendKeys("karimnagar");
	WebElement dropdown=driver.findElement(By.id("region_id"));
	Select statedropdown=new Select(dropdown);
	statedropdown.selectByVisibleText("Alabama");
	WebElement zip=driver.findElement(By.xpath("//input[@id=\"zip\"]"));
	zip.sendKeys("12345");
	WebElement dropdown1=driver.findElement(By.id("country"));
	Select countryropdown=new Select(dropdown1);
	countryropdown.selectByVisibleText("Afghanistan");
	WebElement savebutton=driver.findElement(By.xpath("//button[@class=\"action save primary\"]"));
	
	savebutton.click();
	System.out.println("Address saved sucessfully");
	}
	
	
}
