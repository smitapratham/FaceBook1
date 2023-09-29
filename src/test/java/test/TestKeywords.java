package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


@Listeners(test.Listeners.class)


public class TestKeywords extends BaseTest
{

	

	@Test//(priority=1)//,invocationCount=2)
	public void test1()
	{
		System.out.println("test1 method");
	}
	
	@Test(timeOut=1000)//(priority=2)
	public void test2() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("test2 method");
	}
	
	@Test(dependsOnMethods="test2")
	public void test3() 
	{
		System.out.println("test3 method");
	}
	
	/*@Test  (dependsOnMethods="test2")
	public void test3()
	{
		System.out.println("test3 method");
	}
	*/
	
	/*@Test(priority=3,dependsOnMethods="test3")
	public void test4()
	{
		System.out.println("test4 method");
	}
	@Parameters({"i","j"})
	@Test
	public void test5(int a,int b)
	{
		System.out.println(a+b);
	}*/

}
