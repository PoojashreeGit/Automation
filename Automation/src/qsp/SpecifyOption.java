package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecifyOption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the breakfast");
		String s1=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRUTHVI%20R/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select( mtrlistbox);
		List<WebElement> allop=s.getOptions();
		int count =allop.size();
		int temp=0;
		TreeSet<String>ts=new TreeSet();
		for(int i=0;i<count;i++) {
			ts.add(allop.get(i).getText());
		}
		for(String st:ts) {
			if(st.equalsIgnoreCase(s1)) {
				temp++;
			}
		}
		if(temp==1) {
			System.out.println(s1+"  present");
		}
		else {
			System.out.println(s1+"  notpresent");
		}
			
		driver.quit();	
		}
			
		
		
		

		

	}


