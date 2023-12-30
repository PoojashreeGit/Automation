package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnluDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/hotel.html");
		WebElement slvlistbox=driver.findElement(By.id("mtr"));
		
		Select s =new Select(slvlistbox);
		List<WebElement> allop = s.getOptions();
		int count=allop.size();
		
		ArrayList<String> al=new ArrayList();
		for(int i=0;i<count;i++)
		{
			al.add(allop.get(i).getText());
		}
		
		for(int i=0;i<count;i++)
		{
			int temp=1;
			for(int j=i+1;j<count;j++)
			{
				if(al.get(i).equalsIgnoreCase(al.get(j)))
				{
					temp++;
				}
			}
			if(temp>1)
			{
				System.out.println(al.get(i));
			}
		}
		driver.quit();
	}

}
