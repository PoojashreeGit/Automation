package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlcode {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String htmlcode=driver.getPageSource();
		System.out.println(htmlcode);
		driver.quit();
	}

}
