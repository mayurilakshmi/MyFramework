package Academyyy.MySampleProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage  extends Base{
	/*
	 * @BeforeTest public void initialise() throws IOException {
	 * 
	 * }
	 */
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException {
		driver=initialiseDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogIn().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		System.out.println(text);
		
		lp.getLoginAccount().click();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[2][3];
		
		data[0][0]="nonrestricted@gmail.com";
		data[0][1]="35678858";
		data[0][2]="ehry";
		
		data[1][0]="restricted@gmail.com";
		data[1][1]="35678858gnhmmrjjgrhtr";
		data[1][2]="ehryhhjrgfn";
		
		return data;
		
		
	}
	/*
	 * @AfterTest public void tearDown() { driver.close();
	 * System.out.println("success1"); }
	 */
  
}
