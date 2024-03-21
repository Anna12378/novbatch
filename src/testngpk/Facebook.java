package testngpk;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.getClass();
}

	@Parameters({"username","password"})
	
	@Test
	public void test( String username, String password)
	{
        //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("value=" +username);
		System.out.println("value=" +password);


	}
}
