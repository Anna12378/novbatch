package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frrstscript1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String exp="Gmail";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//driver.quit();//entire browser will close
		//driver.close();//one perticular browser close 
		
		

	}

}
