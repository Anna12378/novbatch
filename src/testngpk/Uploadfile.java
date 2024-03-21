package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Uploadfile {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.ilovepdf.com/pdf_to_word";

	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void uploadfile()
	{
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	    upload.sendKeys("D:\\railway.pdf");
    
        WebElement check=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
        check.click();
        
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
        submit.click();
        }

		
	}

