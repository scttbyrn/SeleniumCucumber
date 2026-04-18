package baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingpage;
	
	public WebDriver initializer () {

		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;


	}

	@BeforeMethod
	public LandingPage launchBrowser() {

		initializer();
		landingpage = new LandingPage(driver);
		return landingpage;

	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();

		
	}

}
