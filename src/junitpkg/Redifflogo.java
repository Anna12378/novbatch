package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	
	ChromeDriver driver;
    String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void logo()
{
	
	
	boolean image=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	 if(image)
	 {
		 System.out.println("logo is displayed");
	 }
	 else
	 {
		 System.out.println("logo is not displayed");
	 }

}

}


