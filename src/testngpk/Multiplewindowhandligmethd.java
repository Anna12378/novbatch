package testngpk;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandligmethd {
	WebDriver d;
    

@BeforeTest
public void setup()
{
	d=new ChromeDriver();
	
}
@Test
public void test()
{
	d.get("https://demo.guru99.com/popup.php");
	String parent=d.getWindowHandle();
	System.out.println("parent window Title:=" +d.getTitle());
	d.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allWindowHandles=d.getWindowHandles();
	for(String handle:allWindowHandles)
	{
		if(!handle.equalsIgnoreCase(parent))
		{
			d.switchTo().window(handle);
			d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
			d.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			
			d.close();
		}
		d.switchTo().window(parent);
	}
}

}
