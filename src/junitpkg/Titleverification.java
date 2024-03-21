


	package junitpkg;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Titleverification {
		ChromeDriver driver;
		String baseurl="https://www.facebook.com";
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
	@Test
		public void titleverification()
		{
			String exp="facebook";
			String actualtitleString=driver.getTitle();
			if(exp.equals(actualtitleString))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
			@After
			public void tearDown()
			{
				driver.quit();
			}
		
	}

			
		



