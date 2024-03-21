package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dragdrop {
ChromeDriver driver=new ChromeDriver();
String baseurl="http://demo.guru99.com/test/drag_drop.html";

@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void dragdrop()
{
	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement ba=driver.findElement(By.xpath("//*//*[@id=\"bank\"]/li"));
	
	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement sa=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	
	WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement am=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	
	WebElement amount1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement am1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(bank, ba);
	act.dragAndDrop(sales, sa);
	act.dragAndDrop(amount,am);
	act.dragAndDrop(amount1, am1);
	act.perform();
	if(driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed())
			
			{
		System.out.println("perfect  displayed");
			}
	else 
	{
		System.out.println("perfect not   displayed");
		
	}
}
}
