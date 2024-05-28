package landingPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Countofthelinks extends DriverIntialization {

	public static void main(String[] args) {
		WebDriver driver=broswerintilizaton();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total no of links available in landing page is " +links.size());
		for(int i=0;i<links.size();i++)
		{
			String linktext=links.get(i).getText();
			String url=links.get(i).getAttribute("href");
			System.out.println(i+1+ ":" +linktext+"----->"+ url);
			}
	driver.close();	
	}

}
