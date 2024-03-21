package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.amazon.in";
	@Before
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void test() throws InterruptedException
	
	{
		
		driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[2]/div/label")).sendKeys("mobile");
		 driver.findElement(By.xpath("Go")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[15]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/dib/span")).click();
		driver.navigate();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a/i")).click();
	}
		 

}
