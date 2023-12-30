package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 boolean logo= driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		 if(logo==true)
		 {
			 System.out.println("logo is enabled and pass");
		 }
		 else
		 {
			 System.out.println("logo is not enabled and fail");
		 }
		 driver.quit();
	}

}
