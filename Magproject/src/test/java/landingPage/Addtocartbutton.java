package landingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addtocartbutton extends DriverIntialization {
//validating addtocart button without adding the product
	
	static WebDriver driver;
	public static void addToCart()
	{
		driver=broswerintilizaton();
		WebElement addToCart=driver.findElement(By.xpath("//div[@class='minicart-wrapper']/child::a[1]"));
		addToCart.click();
		
	}
	public static void Noitems()
	{
		try {
			WebElement Nocartmessage= driver.findElement(By.xpath("block-content"));
		
		if(Nocartmessage.isDisplayed())
		{
			System.out.println("Uesr not having any product in Cart");
		}
		else
		{
			System.out.println("Uesr  having product in Cart");
	
		}}
		catch (Exception NoSuchElementException) {
			System.out.println("Uesr not having any product in Cart");

		}
	}
	public static void main(String[] args) {
	Addtocartbutton.addToCart();
	Addtocartbutton.Noitems();
	}
}
