package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import landingPage.DriverIntialization;

public class loginma extends DriverIntialization {
static List<String>usernamelist=new ArrayList<String>();
static List<String>passwordlist=new ArrayList<String>();
public static void readexcell() throws IOException {

FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\TestData1.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet= workbook.getSheet("sheet1");
int rowcount=sheet.getLastRowNum();
int collcount=sheet.getRow(0).getLastCellNum();
for(int i=0;i<=rowcount;i++)
{
	XSSFRow currentrow=sheet.getRow(i);
	for(int j=0;j<collcount;j++)
	{
		if(j%2==0)
		{
			String username=currentrow.getCell(j).toString();
			usernamelist.add(username);
		}
		else
		{
			String password=currentrow.getCell(j).toString();
			passwordlist.add(password);
		}
	}
}
workbook.close();
}
public static void login(String uname,String pass)
{
WebDriver driver= broswerintilizaton();
WebElement signup= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
signup.click();
WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
email.sendKeys(uname);
WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
password.sendKeys(pass);
WebElement conform=driver.findElement(By.xpath("//button[@name='send' and @class='action login primary']"));
conform.click();
String Actualtitle= driver.getTitle();
String exptitle="Home Page";
System.out.println(Actualtitle);
if(exptitle.equals(Actualtitle))
{
	System.out.println("user login sucessfull");
}
else if (!exptitle.equals(Actualtitle)) {
	System.out.println("user login unsucessfull");
	
}

}
public static void excute()
{
	for(int i=0;i<usernamelist.size();i++)
	{
	login(usernamelist.get(i),passwordlist.get(i));	
	}
}
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	loginma.readexcell();
	loginma.excute();
}
}
