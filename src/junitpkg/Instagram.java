package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void login() throws InterruptedException
	
	{
			Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc.gmail.com");
		WebElement search=driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		
		//search.sendKeys("abc",Keys.ENTER);
		search.sendKeys("abc");
		search.submit();
		//driver.findElement(By.xpath("//form[@id='loginForm']/div")).
	}

}
