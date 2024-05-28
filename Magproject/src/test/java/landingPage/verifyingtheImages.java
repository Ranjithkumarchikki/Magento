package landingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyingtheImages extends DriverIntialization {
//verifying the images available in the landing page.
	static WebDriver driver=broswerintilizaton();
	public static void shopNewYoga()
	{
		WebElement shopNewYoga= driver.findElement(By.xpath("//div[@class='blocks-promo']/child::a[1]"));
		shopNewYoga.click();
		WebElement pagevalidation=driver.findElement(By.xpath("//span[@class='base']"));
		if(pagevalidation.isDisplayed())
		{
			System.out.println("User is in New Luma Yoga Collectn page");
		}
		else {
			System.out.println("User not in New Luma Yoga Collectn page");

		}
		driver.navigate().back();
	}
	
	public static void pants()
	{
		WebElement pants= driver.findElement(By.xpath("//div[@class='block-promo-wrapper block-promo-hp']/child::a/child::img[1]"));
		pants.click();
		WebElement pantspagevalidation=driver.findElement(By.xpath("//span[@class='base' and text()='Pants' ]"));
		if(pantspagevalidation.isDisplayed())
		{
			System.out.println("User is in Pants page");
		}
		else {
			System.out.println("User not in Pants page");

		}}

	public static void main(String[] args) {
		verifyingtheImages.shopNewYoga();
		//DriverIntialization.broswerintilizaton();
		verifyingtheImages.pants();
	}
}
