package landingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hotseller extends DriverIntialization {
static WebDriver driver;
public static void productselection()
{
	driver=broswerintilizaton();
	WebElement size=driver.findElement(By.xpath("//div[@class='swatch-opt-1556']/child::div[1]/child::div/child::div[1]"));
	size.click();
	WebElement colour=driver.findElement(By.xpath("//div[@class='swatch-attribute color']/child::div/child::div[1]"));
	colour.click();
	//WebElement product= driver.findElement(By.xpath("//span[@class='product-image-wrapper']/img[1]"));
	//product.click();
	WebElement addtocart=driver.findElement(By.xpath("//button[@class='action tocart primary']"));
	addtocart.click();
	WebElement paddToCart=driver.findElement(By.xpath("//div[@class='minicart-wrapper']/child::a[1]"));
	paddToCart.click();
	WebElement productAvailabulity=driver.findElement(By.xpath("//span[text()='Item in Cart']"));
	if(productAvailabulity.isDisplayed())
	{
		System.out.println("product added sucessfully to cart");
	}
	else {
		System.out.println("product not added to cart");

	}
}
public static void main(String[] args) {
	Hotseller.productselection();
}
}
