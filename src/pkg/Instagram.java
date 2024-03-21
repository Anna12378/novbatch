package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String baseurl="https://www.instagram.com";
		driver.get(baseurl);
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("gmail present");
		}
		else
		{
			System.out.println("gamil not present");
		}
	}

}
;