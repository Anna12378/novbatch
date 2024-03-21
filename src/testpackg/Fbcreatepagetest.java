package testpackg;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pagepackg.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass{

	
	
	
	@Test
	public void test2()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpageclick();
		String act=ob.titleverification();
		Assert.assertEquals(act, "Facebook");
		ob.signupclick();
		
	}

}
