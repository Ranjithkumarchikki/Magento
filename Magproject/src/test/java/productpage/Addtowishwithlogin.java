package productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Addtowishwithlogin extends AddToCompare {
	public static void main(String[] args) throws InterruptedException {
		AddToCompare.AddtoCompare1();
		addToWishlist.AddToWishList1();
		WebElement validation=driver.findElement(By.xpath("//div[text()='You must login or register to add items to your wishlist.']"));
		if(validation.isDisplayed())
		{
			WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("yonila4533@fincainc.com");
			WebElement password=driver.findElement(By.xpath("//input[@id='pass' and @title='Password']"));
			password.sendKeys("Ranjithkumar@30");
			WebElement signIn=driver.findElement(By.xpath("//div[@class='actions-toolbar'][1]/child::div[@class='primary']/child::button[@class='action login primary']/child::span[text()='Sign In']"));
			signIn.click();
			WebElement validation1=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
			if(validation1.isDisplayed())
			{
				System.out.println("Producted added sucessfull to addtowishlist");

			}
			else {
				System.out.println("Producted not added ");

			}
		}
		else {
			System.out.println("User already login");

		}
	}

}
