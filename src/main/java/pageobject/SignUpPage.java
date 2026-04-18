package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import abstractMethods.ReuseableMethods;

public class SignUpPage extends ReuseableMethods {
	
	WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		
	}
	
	public void signUpAccount(String uname, String pword) {
		
		
		driver.findElement(By.xpath("//a[normalize-space() = 'Sign up']")).click();
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(pword);
		
	}

}
