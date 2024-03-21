package testngpk;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
@Test(groups= {"smoke"})
public void test1()
{
	System.out.println("test1");
}
@Test(groups= {"sanity","smoke"})
public void test2()
{
	System.out.println("test2");
}
@Test(groups= {"regression"})

	public void test3()
	{
		System.out.println("test3");
	}
@Test(groups= {"sanity"})
public void tets4()
{
	System.out.println("test4");
}

}
