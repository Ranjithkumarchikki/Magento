package landingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.github.dockerjava.api.model.Driver;

public class Logout extends DriverIntialization {
	static WebDriver driver= broswerintilizaton();
	public static void main(String[] args) {
		
	
	WebElement signup= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
	signup.click();
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("yonila4533@fincainc.com");
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("Ranjithkumar@30");
	WebElement conform=driver.findElement(By.xpath("//button[@name='send' and @class='action login primary']"));
	conform.click();
	WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button"));
	drop.click();
	WebElement signout=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
	signout.click();
	
}}
