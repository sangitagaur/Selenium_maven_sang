package day1_07122023_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public  LoginPage( WebDriver driver )
	{
		this.driver=driver;
	}
	
	//Repository
	
	By username=By.id("Email");
	By password=By.id("Password");
	By lonbtn=By.xpath("//button[@type='submit']");
	
	
	public void url() throws InterruptedException
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		Thread.sleep(2000);
	}
	
	public void enterEmail(String EId)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("EId");
	}
	
	public void enterpswd(String pwd)
	{
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("pwd");
	}
	
	public void Clicklgn() throws InterruptedException
	
	{
		driver.findElement(lonbtn).click();
		Thread.sleep(2000);
	}
}
