package day2_08122023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	//Repository
	By LogoutLink=By.xpath("");
	
	public void ClickonLogout()
	{
		driver.findElement(LogoutLink).click();
	}

}
