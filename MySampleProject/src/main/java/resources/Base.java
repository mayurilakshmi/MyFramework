package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
public WebDriver driver=null;
	public WebDriver initialiseDriver() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\GIT Project\\MyFramework\\MySampleProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LakshmiPrasad\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equals("firefox")){
		 driver=new FirefoxDriver();
		}
		else {
	     driver=new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
