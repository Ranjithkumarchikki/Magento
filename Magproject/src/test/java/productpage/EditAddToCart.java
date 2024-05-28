package productpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditAddToCart extends AddToCompare{
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
if(shoppingcartbutton.isDisplayed())
{
	System.out.println("product added sucessfully");
}
else {
	System.out.println("product not added sucessfully");

}
shoppingcartbutton.click();

driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
WebElement Edit=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[1]"));
Edit.click();
WebElement size1=driver.findElement(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div[@id='option-label-size-143-item-167']"));
size1.click();
WebElement color1=driver.findElement(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div[@id='option-label-color-93-item-53']"));
color1.click();

WebElement update=driver.findElement(By.xpath("//button[@id='product-updatecart-button']"));
update.click();
try {
WebElement validationtag=driver.findElement(By.xpath("//div[@role='alert']/child::div[1]/div[text()='Marco Lightweight Active Hoodie was updated in your shopping cart.']"));
if(validationtag.isDisplayed())
{
	System.out.println("product updated sucessfully");
}
else {
	System.out.println("product not updated sucessfully");

}}
catch (Exception e) {
System.out.println("product not updated sucessfully");}
	}}

