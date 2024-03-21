package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddropmethd {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="http://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void dragdropmethd()
	{
		WebElement Accoutname=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
		WebElement Amount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Amount, Accoutname);
		act.perform();
	}
	}
