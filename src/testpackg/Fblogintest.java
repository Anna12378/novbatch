package testpackg;




import org.testng.annotations.Test;

import Pagepackg.Fbloginpage;

public class Fblogintest extends Baseclass{
	
	@Test
	public void test()
	{
		Fbloginpage ob = new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "adadc");
		ob.login();
		
		
		
		
	}

}
