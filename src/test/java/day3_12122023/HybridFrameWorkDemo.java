package day3_12122023;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day2_08122023.LoginOperation_ORHM;
import day2_08122023.LogoutOperation_ORHM;

public class HybridFrameWorkDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginOperation_ORHM ln=new LoginOperation_ORHM(driver);
		LogoutOperation_ORHM lo=new LogoutOperation_ORHM(driver);
		
		String Fn="F:\\Selenium_GTM\\DT_testing.xlsx";
		FileInputStream FI=new FileInputStream(Fn);
		XSSFWorkbook worbk=new XSSFWorkbook(FI);
		XSSFSheet dsheet=worbk.getSheet("Data");
		XSSFSheet ksheet=worbk.getSheet("Keyword");
		
		int drows=dsheet.getLastRowNum();
		System.out.println("Datasheet total rows:="+drows);
		
		int krows=ksheet.getLastRowNum();
		System.out.println("Keywordsheet total rows:="+krows);
		
		for(int dr=1;dr<=drows;dr++)
		{
			XSSFRow drow=dsheet.getRow(dr);
			XSSFCell userName=drow.getCell(0);
			XSSFCell passWord=drow.getCell(1);
			//XSSFCell Result=drow.createCell(2);
			System.out.println("USERNAME----"+userName+"   PASSWORD----"+passWord);
		}
		try 
		{
		for(int kr=1;kr<=krows;kr++)
		{
			XSSFRow krow=ksheet.getRow(kr);
			XSSFCell methodname=krow.getCell(1);
			
			switch(methodname.toString())
			{
			case "url":ln.url();
				break;
			case "enterUserName":ln.enterUserName(Fn.toString());
				break;
			case "enterPassWord":ln.enterPassword(Fn.toString());
				break;
			case "clickonlogin":ln.clickonlogin();
				break;
			case "clickonProfile":lo.clickonProfile();
			break;
			case "clickonLogout":lo.clickonLogout();
				break;
			default:
					System.out.println("Invalid Keyword");
			}
		}
         System.out.println("valid");
        
     }
	catch (Exception e)
	{
		System.out.println("invalid data");
		 //String errmsg=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
	}
	FI.close();
}

}