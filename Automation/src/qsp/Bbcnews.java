package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbcnews {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
 List<WebElement> text = driver.findElements(By.xpath("(//a[@class='top-list-item__link']/../..)[1]"));
 int count = text.size();
 for(int i=0;i<count;i++) {
String print=text.get(i).getText();
System.out.println(print);
	}
 driver.quit();

}
}
