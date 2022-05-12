package week4.day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRowColumn {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://html.com/tags/table/");
	
	int tablecount=driver.findElements(By.xpath("//table")).size();
	System.out.println("The number tables in webpage is " +tablecount);
	
	for(int i =1;i<=tablecount;i++)
	{
		
		int tablerow =driver.findElements(By.xpath("(//table)["+i+"]//tr")).size();
		System.out.println("The number of table row ----"+tablerow);
		int tablecoulmn =driver.findElements(By.xpath("(//table)["+i+"]//th")).size();
		System.out.println("The number of table coulmn is ----"+tablecoulmn);
		
	}
	
	
}

}
