package Academyyy.MySampleProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateNavigation extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialise() throws IOException {
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException {


		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getNavigate().isDisplayed());
		//log.info("navigated");
		}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("success3");
	}
	

  
}
