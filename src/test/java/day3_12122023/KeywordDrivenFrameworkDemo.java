/*package day3_12122023;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day2_08122023.LoginOperation_ORHM;
import day2_08122023.LogoutOperation_ORHM;

public class KeywordDrivenFrameworkDemo {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginOperation_ORHM ln=new LoginOperation_ORHM(driver);
		LogoutOperation_ORHM lo=new LogoutOperation_ORHM(driver);
		
		String FileName="F:\\Selenium_GTM\\DT_testing.xlsx";
		
		FileInputStream FIS=new FileInputStream(FileName);
		XSSFWorkbook workook=new XSSFWorkbook(FIS);
		XSSFSheet sheet=workook.getSheet("Keyword");
		
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		
		for(int r=1;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			XSSFCell methodname=row.getCell(1);
			
			System.out.println("Keywords--->"+methodname);
		}
		
		switch()
		{
			case "url":ln.url();
			break;
			case "enterUserName": ln.enterUserName("Admin");
			break;
			case "enterPassword": ln.enterPassword("admin123");
			break;
			case "clickonlogin": ln.clickonlogin(); 
			break;
			case "clickonProfile": lo.clickonProfile();
			break;
			case "clickonLogout": lo.clickonLogout();
			break;
			default: System.out.println("Invalid Keyword");	
		}
				
		

	}

}
*/