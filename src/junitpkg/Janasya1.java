package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Janasya1{
	
      ChromeDriver driver;
     String baseurl="https://janasya.com/";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id='HeaderNavigation']/nav/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[1]/h3")).click();
	driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();

	}
}

