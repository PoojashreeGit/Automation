package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String url=driver.getCurrentUrl();	
		if(url.contains("google"))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		driver.quit();
		
		

	}

}
