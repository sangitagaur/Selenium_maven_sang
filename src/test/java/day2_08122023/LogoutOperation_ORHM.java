package day2_08122023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutOperation_ORHM {
	
	WebDriver driver;
	
   public LogoutOperation_ORHM(WebDriver idriver)
   {
	   driver=idriver;
	   PageFactory.initElements(driver,this);
   }
   //Repository
   @FindBy (xpath="//p[@class='oxd-userdropdown-name']")WebElement profilepic;
   @FindBy (xpath="//ul[@class='oxd-dropdown-menu']/child::li[4]/child::a")WebElement logoutlink;

   
   public void clickonProfile() throws InterruptedException
   {
	   profilepic.click();
	   Thread.sleep(2000);
   }
   
   public void clickonLogout()
   {
	   logoutlink.click();
   }
}
