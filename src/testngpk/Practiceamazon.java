package testngpk;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practiceamazon {
	WebDriver driver;
    

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String exp="Amazon.in : mobile phones";
		String actual=driver.getTitle();
		if(exp.equals(actual)
)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	String parent=driver.getWindowHandle();
    Set<String>allWindowHandles=driver.getWindowHandles();
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	for(String handle:allWindowHandles)
	{
		if(!handle.equalsIgnoreCase(parent))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")).click();
						
			
		}
	}
	
	}
}



	
