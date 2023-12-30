package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		String tagname=driver.findElement(By.id("user_login_btn")).getAttribute("type");
		System.out.println(tagname);
		driver.quit();
		
		
	}

}
