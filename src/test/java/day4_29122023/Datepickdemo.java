package day4_29122023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String expdate="20";
		String expMonthYear="November 2024";
		while(true) {
			String actualMonthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(actualMonthYear);
			if (actualMonthYear.equalsIgnoreCase(expMonthYear))
			{
				List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/child::tbody/child::tr/child::td"));
						for(WebElement date:dates) {
							String actualDate=date.getText();
							if(actualDate.equalsIgnoreCase(expdate))
							{
								date.click();
								Thread.sleep(2000);
								break;
							}
						}
			}
		}
		

	}

}