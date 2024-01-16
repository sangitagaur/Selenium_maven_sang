package day2_08122023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_PF {
	
	WebDriver driver;
	
	 public Logout_PF(WebDriver driver)
	 {
		 this.driver=driver;
		 
		 PageFactory.initElements(driver,this);
	 }
	
       //Repository
	 @FindBy (xpath="//ul[@class='navbar-nav ml-auto pl-2']//child::li[3]/child::a") WebElement LogoutLink;
	 
	 public void Logout()
	 {
		 LogoutLink.click();
	 }
}

