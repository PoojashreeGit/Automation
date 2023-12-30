package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wrappedelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/hotel.html");
		WebElement slvlistbox=driver.findElement(By.id("slv"));
		Select s =new Select(slvlistbox);
 String allsec= s.getWrappedElement().getText();
	
		
			System.out.println(allsec);
		
		
		driver.quit();
		

	}

}
