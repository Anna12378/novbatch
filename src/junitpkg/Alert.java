package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	ChromeDriver driver;
	String baseurl="file:///D:/alert.html";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("lastname")).click();
		

}
}
