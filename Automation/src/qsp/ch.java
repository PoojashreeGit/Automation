package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ch {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		boolean logo= driver.findElement(By.id("filled-in-box")).isSelected();
		if(logo==true)
		{
			System.out.println("checkbox is selected and pass");
		}
		else
		{
			System.out.println("checkbox is not selected and fail");
		}
driver.quit();
	}
		
	
}
