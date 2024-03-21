package testngpk;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {
ChromeDriver driver=new ChromeDriver();
String baseurl="https://www.facebook.com";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void titleverification()
{
	String exp="Facebook";
	String act=driver.getTitle();
	Assert.assertEquals(act,exp );
	System.out.println("test1");
}
}
