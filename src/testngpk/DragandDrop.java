package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="http://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);	
	}
    @Test		
    public void DragnDrop()					
    {		
        WebElement bank=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        WebElement ba=driver.findElement(By.xpath("//*[@id='bank']/li"));					
        Actions act=new Actions(driver);
			
     	WebElement amount=driver.findElement(By.xpath("//*[@id='credit1']/a"));
        WebElement amnt=driver.findElement(By.xpath("//*[@id='loan']/li"));					
      
     		
        WebElement sales=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
        WebElement sa=driver.findElement(By.xpath("//*[@id='amt7']/li"));					
      
	
        WebElement amount1=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
        WebElement a1=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
       
	
     						

	
     	act.dragAndDrop(bank, ba);
       	act.dragAndDrop(amount, amnt);////*[@id="equal"]/a
        act.dragAndDrop(sales, sa);
        act.dragAndDrop(amount1, a1);
     	act.perform();
     	
     	if(driver.findElement(By.xpath("//*[@id='equal']/a")).isDisplayed())							
     	{		
         	System.out.println("Perfect Displayed !!!");					
     	}
		else
     	{
        	System.out.println("Perfect not Displayed !!!");					
     	}		
}
	
    }

