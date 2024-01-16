package day2_08122023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOperation_ORHM {
	
	WebDriver driver;
	
	public LoginOperation_ORHM(WebDriver idriver)
	{
		driver=idriver;
		
		PageFactory.initElements(driver,this);;
	}

	///Repository
	@FindBy (name="username") WebElement email;
	@FindBy (name="password") WebElement pass ;
	@FindBy (xpath="//button[@type='submit']")WebElement loginbtn;
	
	public void url() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);	
	}
	public void enterUserName(String em)
	{
		email.clear();
		email.sendKeys(em);
	}
	public void enterPassword(String pw)
	{
		pass.clear();
		pass.sendKeys(pw);
	}
	public void clickonlogin() throws InterruptedException
	{
		loginbtn.click();
		Thread.sleep(2000);
	}
	
}
