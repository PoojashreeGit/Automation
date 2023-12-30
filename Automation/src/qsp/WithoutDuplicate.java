package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/hotel.html");
		Select s =new Select(driver.findElement(By.id("mtr")));
		List<WebElement> allop = s.getOptions();
		int count=allop.size();

		TreeSet<String>ts =new TreeSet<>();

		for(int i=0;i<count;i++) {
			ts.add(allop.get(i).getText());

		}
		for(String st:ts)
		{
			System.out.println(st);
		}

	}


}


