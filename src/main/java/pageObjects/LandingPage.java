package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("#content > div > div > h2");
	By navigate=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getLogIn() {
		return driver.findElement(signin);
		
	}public WebElement getTitle() {
		return driver.findElement(title);
		
	}
	public WebElement getNavigate() {
		return driver.findElement(navigate);
		
	}

}
