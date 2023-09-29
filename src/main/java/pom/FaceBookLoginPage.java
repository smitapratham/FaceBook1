package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage 
{
	//all datamembers are declared globally and private
	
		@FindBy(xpath="//input[@id='email']")private WebElement email;
		@FindBy(xpath="//input[@id='pass']")private WebElement pass;
		@FindBy(xpath="//button[@name='login']")private WebElement login;
		@FindBy(xpath="//a[text()='Forgot password?']")private WebElement forgot;
		@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")private WebElement createacc;
		@FindBy(xpath="//a[contains(@href,'ref_type=registration_form')]")private WebElement createpage; 
		
		public FaceBookLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void enterEmailID(String emailID)
		{
			email.sendKeys(emailID);
		}
		
		public void enterPassword(String password)
		{
			pass.sendKeys(password);
		}
		public void clickOnLogin()
		{
			login.click();
		}
		
		public void forgotpassword()
		{
			forgot.click();
		}
		
		public void createaccount()
		{
			createacc.click();
		}
		
		public void createpage()
		{
			createpage.click();
		}
	}



