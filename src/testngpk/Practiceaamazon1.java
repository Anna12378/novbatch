package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practiceaamazon1 {
	WebDriver driver;
	String baseurl="https://www.amazon.in/";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		WebElement search=driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
		search.sendKeys("mobile phones",Keys.ENTER);
		String exptitle="Amazon.in:Mobile Phones";
		String acttitle=driver.getTitle();
		if(acttitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("The title is verified");
		}
		else
		{
			System.out.println("title not verified");
		}
	}

}
