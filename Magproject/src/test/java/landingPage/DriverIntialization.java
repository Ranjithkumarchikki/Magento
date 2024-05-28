package landingPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverIntialization {
	
	public static WebDriver broswerintilizaton()
	{
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://magento.softwaretestingboard.com/");
	 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 return driver;
	}
	}