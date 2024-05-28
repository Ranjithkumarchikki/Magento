package landingPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByTagName;

public class Counttotalimages extends DriverIntialization {

	public static void main(String[] args) {
		WebDriver driver=broswerintilizaton();
		List<WebElement>img=driver.findElements(By.tagName("img"));
		System.out.println("Total no of images available in landing page is" +img.size());
		for (int i=0;i<img.size();i++)
		{
			String imgtxt=img.get(i).getText();
			String url=img.get(i).getAttribute("src");
			System.out.println(i+1 + imgtxt +"---->"+url);
		}
driver.close();
	}

}
