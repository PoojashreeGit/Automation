package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import qsp.PropertyFileInMethod;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closebrowser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		PropertyFileInMethod op=new PropertyFileInMethod();
		String url = op.getPropertyFile("url");
		String un = op.getPropertyFile("un");
		String pwd = op.getPropertyFile("pwd");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}

}
