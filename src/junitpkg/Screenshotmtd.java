package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotmtd {
ChromeDriver driver;
String url="https://www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void screenshot() throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("e://Fbscreenshot.png"));

}
}
