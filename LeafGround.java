package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement table = driver.findElement(By.xpath("//table"));
		int rows = table.findElements(By.xpath("//tr")).size();
		System.out.println("The number of rows in table is --->" + rows);
		int column = table.findElements(By.xpath("//td")).size();
		System.out.println("The number of column is -->" + column);

		String text = driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
		System.out.println("The value of progress for learnLocators --->" + text);
		List<String> rowList = new ArrayList<String>();
		for (int i = 2; i <= rows; i++) {

			String value = driver.findElement(By.xpath("//tr[" + i + "]/td[2]")).getText();
			if (!(value.equals("100%"))) {
				rowList.add(value);
			}

		}
		System.out.println("Before sorting--->" + rowList);
		Collections.sort(rowList);
		System.out.println("After sorting----->" + rowList);
		String leastValue = rowList.get(0);
		System.out.println("The least value is-->"+leastValue);
		for (int j = 2; j <= rows; j++) {
			String newValue = driver.findElement(By.xpath("//tr[" + j + "]/td[2]")).getText();
			if (leastValue.equals(newValue))

				driver.findElement(By.xpath("//tr[" + j + "]/td[3]")).click();
			if (driver.findElement(By.xpath("//table//tr[" + j + "]//input")).isSelected()) {
				System.out.println("The vital task for the least completed progress is selected");
			}

		}
	}
}
