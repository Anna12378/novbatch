package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//browser load
		driver.get("https://www.google.com");//url load 
		String exp="google";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
        
	}

}
