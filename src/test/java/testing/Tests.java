package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LandingPage;
import pageobject.SignUpPage;

public class Tests extends BaseTest{

		
		
	@Test (dataProvider = "getData")
	public void test1(String uname, String pword) {
		
		landingpage.openBrowser("https://github.com");
		Assert.assertTrue(landingpage.validateHeaders());
		SignUpPage signuppage = landingpage.clickHeaders();
		signuppage.signUpAccount(uname, pword);
	}	
	
	
//	@Test (dataProvider = "getData")
//	public void test2(String uname, String pword) {
//		
//		landingpage.openBrowser("https://github.com");
//		Assert.assertTrue(landingpage.validateHeaders());
//		SignUpPage signuppage = landingpage.clickHeaders();
//		signuppage.signUpAccount(uname, pword);
//	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		
		return new Object [] [] {{"scott", "password123"},{"byron", "!@#$$%%^&^"}};
	}

		

		

}
