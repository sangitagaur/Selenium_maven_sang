package day1_07122023_POMCalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day1_07122023_POM.LoginPage;
import day2_08122023.LogoutPage;

public class CallingPom {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		LoginPage lp=new LoginPage( driver);
		lp.url();
		lp.enterEmail("admin@yourstore.com");
		lp.enterpswd("admin");
		lp.Clicklgn();
				 
			 
		LogoutPage lop=new LogoutPage(driver);
		lop.ClickonLogout();
	}

}
