package landingPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.core.exec.WaitContainerCmdExec;

public class Searchfunctionality extends DriverIntialization{

	public static void main(String[] args) throws Throwable {
	WebDriver driver=broswerintilizaton();
	 Thread.sleep(2000);

	Robot ro=new Robot();
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("dre");
	 Thread.sleep(2000);
	ro.keyPress(KeyEvent.VK_DOWN);
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_DOWN);
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyPress(KeyEvent.VK_ENTER);
try {
	WebElement searchvalidationwomen=driver.findElement(By.xpath("//a[text()='women T shirts']"));
WebElement searchvalidationmen=driver.findElement(By.xpath("//a[text()='men t-shirt']"));


if(searchvalidationwomen.isDisplayed())
{
	System.out.println("select option is women clothes");
}
else if(searchvalidationmen.isDisplayed()) {
	System.out.println("select option is men clothes");

}}
catch (Exception NoSuchElementException) {
	
	System.out.println("Displayed page are not correct");// TODO: handle exception
}
	}

}
