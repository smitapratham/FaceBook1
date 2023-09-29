package test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.LaunchBrowser;
import pom.SwagLabsLoginPage;

import org.testng.annotations.Listeners;

@Listeners(test.Listeners.class)
public class SwagLabsLoginTest extends BaseTest
{
	//WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver=LaunchBrowser .openBrowser("https://www.saucedemo.com/") ;
		
	}
	@Test
	public void loginWithValidCredentials()
	{
		SoftAssert st=new SoftAssert();
		SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
		st.assertFalse(slab.isLogoDisplayed());
		//st.assertAll();
		slab.enterUserName("standard_user");
		slab.enterPassword("secret_sauce");
		slab.clickOnLogin();
		String url1=driver.getCurrentUrl();
		//asserEquals will will give passed test here 
		Assert.assertEquals(url1,"https://www.saucedemo.com/inventory.html");
		System.out.println("post assertion");
	
		//st.assertTrue(slab.isproDisplayed());
		//System.out.println("-----------");
		st.assertAll();
		
		//slab.selectpack1();
	}
	//@Test
	/*public void login1()
	{
		SoftAssert st=new SoftAssert();
		SwagLabsLoginPage slab=new SwagLabsLoginPage(driver);
		st.assertFalse(slab.isproDisplayed());
		System.out.println("-----------");
		st.assertAll();
	}*/
	
	/*public static void main(String args[])
	{
		SwagLabsLoginTest obj=new SwagLabsLoginTest();
		obj.loginWithValidCredentials();
	}*/


}
