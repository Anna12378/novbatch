package testngpk;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenmethd {
	WebDriver driver;
    

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void datadriven() throws Exception
{
	
	driver.get("https://www.facebook.com");
	FileInputStream fi=new FileInputStream("D:\\Book1.xlsx");
	 XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("sheet1");//return sheet details
		int rowcount=sh.getLastRowNum();//return rowcount
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username:=" +username);
			String paswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("paswd:=" +paswd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(paswd);
			driver.findElement(By.name("login")).click();
			
			driver.navigate().refresh();
			//driver.navigate().forward();
			//driver.navigate().back();
			//driver.navigate().to(paswd);
			//driver.getCurrentUrl();//currenurl get cheyyan
		
}
	}

}

