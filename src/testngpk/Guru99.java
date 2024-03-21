package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99 {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://demo.guru99.com/";
@BeforeMethod
public void setup()
{
		driver=new ChromeDriver();
		driver.get(baseurl);
}
	@Test
	public void gmail()
	
	{
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("titunivin7@gmail.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		
	}

}
