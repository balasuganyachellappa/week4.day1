package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		List<WebElement> rowcontent = driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println("---------------------------------");
		System.out.println("Row content -->" + rowcontent.get(0).getText());
		System.out.println("Row content -->" + rowcontent.get(1).getText());

	}
}
