package day3_12122023;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        String FileName="F:\\Selenium_GTM\\DT_testing.xlsx";
		FileInputStream FIS=new FileInputStream(FileName);
		XSSFWorkbook workbook=new XSSFWorkbook(FIS);
		XSSFSheet sheet=workbook.getSheet("data");
		
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for(int r=1;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			XSSFCell userName=row.getCell(0);
			XSSFCell passWord=row.getCell(1);
			XSSFCell result=row.createCell(2);
			
			System.out.println("Username--->"+userName+"     Password--->"+passWord);
			try {
			driver.findElement(By.name("username")).sendKeys(userName.toString());
			driver.findElement(By.name("password")).sendKeys(passWord.toString());
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//[ul@class='oxd-dropdown-menu']/child::li[4]/child::a")).click();
			System.out.println("Valid");
			result.setCellValue("Valid");
			}
			catch(Exception e)
			{
				System.out.println("Invalid");
				String errmsg=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
				result.setCellValue(errmsg);
			}
		}
		FIS.close();
		FileOutputStream FOS=new FileOutputStream(FileName);
		workbook.write(FOS);
	}

}
