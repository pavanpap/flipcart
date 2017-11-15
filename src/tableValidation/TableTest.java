package tableValidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://money.rediff.com/tools/forex");
		WebElement table;
		table=driver.findElement(By.className("dataTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);

	}

}
