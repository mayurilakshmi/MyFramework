package Academyyy.MySampleProject;

import java.io.IOException;


import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage  extends Base{
	@Test
	public void basePageNavigation() throws IOException {
		driver=initialiseDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.getLogIn().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("jhiugjag");
		lp.getPassword().sendKeys("hdgdnddm");
		
		
		
	}
  
}
