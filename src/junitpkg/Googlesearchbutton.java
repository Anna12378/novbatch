package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchbutton {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void login()
	{
		WebElement search=driver.findElement(By.name("q"));
				search.sendKeys("animal",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}

}
