package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//"https://www.saucedemo.com/"
public class SwagLabsLoginPage 
{
	//all datamembers are declared globally and private
	
		@FindBy (id="user-name")private WebElement username;
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		*/
		@FindBy(id="password")private WebElement password;
		/*WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		*/
		@FindBy(name="login-button")private WebElement login;
		/*WebElement login=driver.findElement(By.name("login-button"));
		login.click();*/
		
		@FindBy(xpath="//div[text()='Sauce Labs Backpack']")private WebElement pack1;
		
		@FindBy(xpath="//div[text()='Swag Labs']")private WebElement logo;
		 @FindBy(xpath="//span[text()='Products']") private WebElement pro;
		
		////////////////////////////////////////////////
		public SwagLabsLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void enterUserName(String name1)
		{
			username.sendKeys(name1);
			
		}
		
		public void enterPassword(String pass1)
		{
			password.sendKeys(pass1);
			
		}
		
		public void clickOnLogin()
		{
			
			login.click();
		}
		public void selectpack1()
		{
			pack1.click();
		}
		
		public boolean isLogoDisplayed()
		{
			return logo.isDisplayed();
		}
		
		public boolean isproDisplayed()
		{
			return pro.isDisplayed();
		}
}
