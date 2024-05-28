package landingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Supportthisproject extends DriverIntialization {

	public static void main(String[] args) throws Exception{
WebDriver driver=broswerintilizaton();
String actualtitle=driver.getTitle();
WebElement supportProject=driver.findElement(By.xpath("//a[text()='Support This Project']"));
supportProject.click();
WebElement validationOfwebelement=driver.findElement(By.xpath("//span[text()='Support $5']"));
if(validationOfwebelement.isDisplayed())
{
	System.out.println("Support this project button is working ");
	Thread.sleep(2000);
	
		
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
		uname.sendKeys("rkumar@gmail.com");
		WebElement message=driver.findElement(By.xpath("//*[@id=\"tw-ctr-page\"]/div[1]/div[1]/div/div/div/div[2]/div[2]/div[2]/textarea"));
	message.sendKeys("enjoy the coffe");
	driver.findElement(By.xpath("//*[@id=\"tw-ctr-page\"]/div[1]/div[1]/div/div/div/div[2]/div[2]/div[4]/button")).click();
	}

else {
	System.out.println("Support this project button is not working ");
}


	}

}
