package productpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteAddtocartproduct extends AddToCompare {
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
WebElement DeleteButton=driver.findElement(By.xpath("//a[@class=\"action action-delete\"]"));
DeleteButton.click();
try {
WebElement validationtag=driver.findElement(By.xpath("//div[@class=\"cart-empty\"]/child::p[1]"));
if(validationtag.isDisplayed())
{
	System.out.println("product Deleted sucessfully");
}
else {
	System.out.println("product not Deleted sucessfully");

}}
catch (Exception e) {
System.out.println("product not Deleted sucessfully");}
	}}


