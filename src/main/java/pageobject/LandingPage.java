package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractMethods.ReuseableMethods;

public class LandingPage extends ReuseableMethods {

	WebDriver driver;
	SignUpPage signuppage;

	public LandingPage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//div[@class = 'test']")
	private WebElement testButton;
	
	public Boolean validateHeaders () {
		
		List <WebElement> headercheck = driver.findElements(By.xpath("//div/button[@class = 'NavDropdown-module__button__PEHWX js-details-target']"));
		Boolean headervalidate = headercheck.stream().anyMatch(headerchecks -> headerchecks.getText().equalsIgnoreCase("solutions"));
		return headervalidate;
	}
	
	public SignUpPage clickHeaders() {
		
		List <WebElement> header = driver.findElements(By.xpath("//div/button[@class = 'NavDropdown-module__button__PEHWX js-details-target']"));
		WebElement headerclick = header.stream().filter(headers -> headers.getText().equalsIgnoreCase("resources")).findFirst().orElse(null);
		headerclick.click();
		return signuppage = new SignUpPage(driver);
		
	}



}
