package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobuttondisplay {
	ChromeDriver driver;
    String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
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



