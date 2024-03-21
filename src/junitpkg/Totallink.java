package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallink {
	
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	
		
	}
	@Test
	public void linkvalidation()
	{
		List<WebElement> linklist = driver.findElements(By.linkText("a"));
		System.out.println("total link count=" +linklist.size());
		for(WebElement ele:linklist)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
		
	}
	private void verify(String link) {
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200 --sucessfull");
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("response code is 400-brokenlist");
			}
			{
				System.out.println("not expected");
			}
		
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	}


