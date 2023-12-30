package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Arraysort {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/hotel.html");
		WebElement mtrlistbox=driver.findElement(By.id("mtr"));
		Select s =new Select( mtrlistbox);
		List<WebElement> allsort = s.getOptions();
		ArrayList<String> al=new ArrayList();
		for(int i=0;i<allsort.size();i++)
		{
			al.add(allsort.get(i).getText());
		}
		Collections.sort(al);
		for(String s1:al) {
			System.out.println(s1);
		}
		driver.quit();	}

}
