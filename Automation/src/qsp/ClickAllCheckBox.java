package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckBox {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
	int count=check.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
   check.get(i).click();
 

}
	driver.quit();
}
}
