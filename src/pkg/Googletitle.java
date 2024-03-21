package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googletitle {
	
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String exp = "Google";
		String actual=driver.getTitle();
		
		
		if(exp==actual)
			
		{
			System.out.println("title verified");
		}
		else 
		{
			System.out.println("not verified");
		}
	}

}
