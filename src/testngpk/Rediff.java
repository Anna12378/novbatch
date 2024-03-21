package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		
		driver.get(baseurl);
	}
@Test(priority=2)
public void contentverification()
{
	String src=driver.getPageSource();
	src.contains("Full Name");
	if(src.contains("Full Name"))
	{
		System.out.println("full name label is present");
	}
	else
	{
		System.out.println("full name label is not present");
	}
}
@Test(priority=1)//2
public void buttontextverification()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		if(buttontext.equals("Create my account"))
		{
			System.out.println("pass");
	}
		else
		{
			System.out.println("fail");
		}
}
@Test(priority=3)
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
@Test(priority=4)
public void titleverification()
{
	String exp="rediff.com";
	String actualtitle=driver.getTitle();
	if(exp.equals(actualtitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@Test(priority=5)
public void radiobutton()
{
	boolean radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();

if(radio)
{
	System.out.println("male radion button selected");
}
else
{
	System.out.println("male radion button is not selected");
}
}
}

