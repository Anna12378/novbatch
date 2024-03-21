package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	
		
	}
	@Test
	public void login()
	{
		WebElement search=driver.findElement(By.name("q"));
		
		
		search.sendKeys("mobile",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}   

}
