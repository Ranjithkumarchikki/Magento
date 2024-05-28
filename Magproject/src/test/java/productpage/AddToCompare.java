package productpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import landingPage.DriverIntialization;

public class AddToCompare extends DriverIntialization {
	static WebDriver driver= broswerintilizaton();

public static void AddtoCompare1() throws InterruptedException {
	
	Actions act= new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();

	act.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-17']"))).build().perform();
	WebElement HoodiesSweatshirts=driver.findElement(By.xpath("//*[@id=\"ui-id-20\"]/span"));
HoodiesSweatshirts.click();
WebElement selectProduct=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"));
selectProduct.click();
}
public static void productcompare()
{
WebElement  AddToCompare=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[2]/span"));
AddToCompare.click();
WebElement AddTocartProductName=driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']"));
WebElement AddToCompareProductName=driver.findElement(By.xpath("//span[@data-ui-id='page-title-wrapper']"));
if(AddTocartProductName.equals(AddToCompareProductName))
{
	System.out.println("product is added correct");
}
else {
	System.out.println("product is not added correct");

}
}
public static void main(String[] args) throws InterruptedException {
	//AddToCompare.broswerintilizaton();
	AddToCompare.AddtoCompare1();
	
	AddToCompare.productcompare();
}
}
