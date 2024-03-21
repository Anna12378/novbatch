package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplaymthd {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
@Test
public void logodisplay()
{
	Boolean image=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	if(image)
	{
		System.out.println("logo is displayed");
}
	else
	{
		System.out.println("not displayed");
	}
}
}
