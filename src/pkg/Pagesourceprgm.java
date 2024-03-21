package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourceprgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("gamil is presnet");
		}
		else
		{
			System.out.println("gamil is not presnet");
		}
          driver.quit();
	}

}
