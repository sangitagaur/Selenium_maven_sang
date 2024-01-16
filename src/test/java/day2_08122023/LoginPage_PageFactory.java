package day2_08122023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	WebDriver driver;
	
	public LoginPage_PageFactory(WebDriver idriver)
	{
		driver=idriver;
		
		PageFactory.initElements(driver,this);
	}
	
	//Repository
	@FindBy (id="email") WebElement email;
	@FindBy (id="Password") WebElement pwd;
	@FindBy (xpath="//button[@type='submit']") WebElement lik;

	
	public void urladdres() throws InterruptedException
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		Thread.sleep(2000);
	}
	
	public void PutUname(String un)
	{
		email.clear();
		email.sendKeys(un);
	}
	
	public void PutPwd(String pd)
	{
		pwd.clear();
		pwd.sendKeys(pd);
	}
	
	public void link() throws InterruptedException
	{
		lik.click();
		Thread.sleep(2000);
	}
}
