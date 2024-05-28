package landingPage;


import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium 4.10.0\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(url);
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is an Empty............");
				continue;
			}
			
			try {
				HttpsURLConnection huc=(HttpsURLConnection) (new URL(url).openConnection());
				huc.connect();
				
				if(huc.getResponseCode()>=400)
				{
					System.out.println(url+" is Broken Link...........");
				}
				else
				{
					System.out.println(url+" is Valid URL.......");
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
