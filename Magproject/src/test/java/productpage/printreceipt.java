package productpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import landingPage.DriverIntialization;

public class printreceipt extends DriverIntialization {

	static WebDriver driver= broswerintilizaton();
	public static void product() throws InterruptedException {
		WebElement signup= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
		signup.click();
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("yonila4533@fincainc.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Ranjithkumar@30");
		WebElement conform=driver.findElement(By.xpath("//button[@name='send' and @class='action login primary']"));
		conform.click();
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
		
printreceipt.product();	
	Thread.sleep(2000);
WebElement size=driver.findElement(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div[@id='option-label-size-143-item-166']"));
size.click();
WebElement color=driver.findElement(By.xpath("//div[@class='swatch-attribute-options clearfix']/child::div[@id='option-label-color-93-item-50']"));
color.click();
WebElement addtocartbutton=driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
addtocartbutton.click();
Thread.sleep(2000);
try {
WebElement shoppingcartbutton=driver.findElement(By.xpath("//a[text()='shopping cart']"));
driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
shoppingcartbutton.click();

WebElement processedbutton=driver.findElement(By.xpath("//button[@class=\"action primary checkout\"]/child::span[1]"));
processedbutton.click();
driver.navigate().refresh();
WebElement next=driver.findElement(By.xpath("//button[@class=\"button action continue primary\"]"));
next.click();
//driver.navigate().refresh();

WebElement placeorder=driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
placeorder.click();
}
catch (Exception e) {
}
WebElement processedbutton1=driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
processedbutton1.click();
WebElement validation=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span"));
if (validation.isDisplayed()) {
	System.out.println("Thank you for your purchase!");
}
else {
	
	System.out.println("producted  not purchase");
	}
WebElement print=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/a"));
print.click();
	System.out.println("order printed ready");

	}
}
