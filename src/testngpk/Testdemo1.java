package testngpk;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testdemo1 {
	//@beforesuite
	//@beforetest
	//@beforeclass
	//@test
	//@aftermethod
	//@afterclass
	//@aftertest
	//@aftersuite
	@BeforeTest
	public void setup()
	{
		System.out.println("browser opening");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("urel loading");
	}
	@Test(priority=2,dependsOnMethods = {"test2"})//test 3 thavana execute cheyyam(nmmk ethra thavan execute cheyyano we should use invocationCount),//which is test 2 is depends on test1
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=1,enabled = false)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=3,enabled=false)//test3 execute cheyyille remain execute cheyyum
	public void test3()
	{
		System.out.println("test3");
	}
   @AfterMethod
   public void aftermthd()
   {
	   System.out.println("aftermethord");
   }
   @AfterTest
   public void browserquite()
   {
	   System.out.println("close browser");
   }
}
