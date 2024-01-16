package day1_07122023_POMCalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day2_08122023.LoginPage_PageFactory;
import day2_08122023.Logout_PF;

public class Pomcalling_PF {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage_PageFactory lf=new LoginPage_PageFactory(driver);
		lf.link();
		lf.PutUname("admin@yourstore.com");
		lf.PutPwd("admin");
		lf.urladdres();
		
		Logout_PF lfo=new Logout_PF(driver);
		lfo.Logout();
		
		

	}

}
