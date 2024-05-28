package productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import landingPage.DriverIntialization;

public class addToWishlist extends AddToCompare {
	//with out login chicking user able to addtowhishlist
//static WebDriver driver=broswerintilizaton();
public static void AddToWishList1() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement addTowishlistButton=driver.findElement(By.xpath("//div[@class='product-addto-links']/child::a[1]/child::span[1]"));
addTowishlistButton.click();
WebElement validation=driver.findElement(By.xpath("//div[text()='You must login or register to add items to your wishlist.']"));
if(validation.isDisplayed())
{
	System.out.println("User need to login");
}
else {
	System.out.println("User already login");

}
}
public static void main(String[] args) throws InterruptedException {
	AddToCompare.AddtoCompare1();
	addToWishlist.AddToWishList1();
}
}
