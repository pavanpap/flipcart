package tableValidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class primusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		WebElement table;
		table=driver.findElement(By.id("DGBanker"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size()-2);
		
	}

}
