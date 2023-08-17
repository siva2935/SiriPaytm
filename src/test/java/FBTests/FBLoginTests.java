package FBTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import FBPages.FBLoginpage;

public class FBLoginTests extends BaseClass{

	FBLoginpage fbtestlogin;
	
	public FBLoginTests() {
		super();
	}
	
	@BeforeMethod
	public void Startup() {
		inceptions();
		fbtestlogin = new FBLoginpage();
	}
	
	@Test
	public void FBLoginTest1231() {
		
		fbtestlogin = fbtestlogin.fblogintest2(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	
	/*@AfterMethod
	public void Terminate() {
		
      driver.close();	
	} */
}

 