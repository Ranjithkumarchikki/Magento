package productpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppalyDiscountcode extends AddToCompare {
	public static void main(String[] args) throws InterruptedException {
		AddToCompare.AddtoCompare1();
	
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
WebElement Applaycopun=driver.findElement(By.xpath("//*[@id=\"block-discount\"]/div[1]"));
Applaycopun.click();
WebElement enterdiscountcode=driver.findElement(By.xpath("//input[@id=\"coupon_code\"]"));
enterdiscountcode.sendKeys("qqwqwq");
WebElement applaydicountbutton=driver.findElement(By.xpath("//button[@class=\"action apply primary\"]"));
applaydicountbutton.click();
WebElement validationtag=driver.findElement(By.xpath("//div[@role=\"alert\"]/child::div[1]/child::div[1]"));
if(validationtag.isDisplayed())
{
	System.out.println("The coupon code is not valid.");
}
else {
	System.out.println("The coupon code is  valid.");

}
	}}

 


