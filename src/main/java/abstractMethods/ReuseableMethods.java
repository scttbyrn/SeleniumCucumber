package abstractMethods;

import org.openqa.selenium.WebDriver;

public class ReuseableMethods {
	
	WebDriver driver;
	
	public ReuseableMethods(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void openBrowser(String url) {
		
		driver.get(url);
		
//		"https://github.com"
		
	}
	
	

}
