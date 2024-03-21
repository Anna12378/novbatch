package testngpk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rightclick {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
@BeforeMethod
public void setup()
{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void Rightclickmthd()
	{
		Actions action = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		action.perform();
	    WebElement link =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		action.doubleClick(link).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
}
}


    

