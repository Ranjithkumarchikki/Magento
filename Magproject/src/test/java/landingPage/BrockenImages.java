package landingPage;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Link;

public class BrockenImages {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		List<WebElement> images= driver.findElements(By.tagName("img"));
		int imagescount=images.size();
		System.out.println(imagescount);
		for(WebElement image:images)
		{
			String src=image.getAttribute("src");
			System.out.println("---------------------------------------");
			System.out.println(src);
		URL url=new URL(src);
		
		try {
			//HttpsURLConnection hus=(HttpsURLConnection) (new (URL(url).op)
			HttpsURLConnection huc=(HttpsURLConnection)(url) .openConnection();
			huc.connect();
			if(huc.getResponseCode()>=400)
			{
				System.out.println(src+"---->"+"images are broken");
			}
			else {
				System.out.println(src+"---->"+"images are valid");

			}
		} catch (Exception e) {
e.printStackTrace();
}
		}
	}
}
		
	


