package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.LaunchBrowser;
import pom.FaceBookLoginPage;
import utility.Reports;



public class FaceBookLoginTest extends BaseTest
{
	//WebDriver driver;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	
	@BeforeClass
	public void addReports()
	{
		extentReports=Reports.configureReports();
	}
	
	@BeforeMethod
	public void browser()
	{
		 driver=LaunchBrowser.openBrowser("https://www.facebook.com/") ;
	}

	@Test
	public void loginWithValidCredentials()
	{
		extentTest=extentReports.createTest("loginWithValidCredentials");
		FaceBookLoginPage fb=new FaceBookLoginPage(driver);
		fb.enterEmailID("smita1@gmail.com");
		fb.enterPassword("11111");
		fb.clickOnLogin();
		
	}
	
	@Test
	public void loginWithValidUserNameAndInvalidPassword()
	{
		extentTest=extentReports.createTest("loginWithValidUserNameAndInvalidPassword");
		//WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com/") ;
		FaceBookLoginPage fb=new FaceBookLoginPage(driver);
		fb.enterEmailID("smita2@gmail.com");
		fb.enterPassword("22222");
		fb.clickOnLogin();
		
	}
	
	
	@Test
	public void loginWithInvalidUserNameAndValidPassword()
	{
		extentTest=extentReports.createTest("loginWithInvalidUserNameAndValidPassword");
		//WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com/") ;
		FaceBookLoginPage fb=new FaceBookLoginPage(driver);
		fb.enterEmailID("smita3@gmail.com");
		fb.enterPassword("3333");
		fb.clickOnLogin();
		
	}
	@AfterMethod
	public void closeBrowser(ITestResult result)
	{
		if(result.getStatus()==result.SUCCESS)
		{
			extentTest.log(Status.PASS,result.getName());
		}
		else if(result.getStatus()==result.FAILURE)
		{
			extentTest.log(Status.FAIL,result.getName());
		}
		else if(result.getStatus()==result.SKIP)
		{
			extentTest.log(Status.SKIP,result.getName());
		}
		
		driver.close();
	}
	
	@AfterClass
	public void flushData()
	{
		extentReports.flush();
		
	}
	
	public void forgotpassword()
	{
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com/") ;
		FaceBookLoginPage fb=new FaceBookLoginPage(driver);
		fb.forgotpassword();
	}
	/*@Test
	
	public void createaccount()
	{
		//WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com/") ;
		FaceBookLoginPage fb=new FaceBookLoginPage(driver);
		fb.createaccount();
		//String url1=driver.getCurrentUrl();
		
	}*/
	
	/*public void createpage()
	{
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com/") ;
		FaceBookLoginPage fb=new FaceBookLoginPage(driver);
		fb.createpage();
		
	}*/
		
		
	
	
	
	


}
