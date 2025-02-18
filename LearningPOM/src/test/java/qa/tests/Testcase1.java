package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
	ElementFetch ele = new ElementFetch();
	
	HomePageEvents homepage = new HomePageEvents();
	LoginPageEvents loginpage = new LoginPageEvents();
	
	@Test
	public void sampleMethodForEnteringCredentials() {
		logger.info("Go to Login Page");
		homepage.signInPageButton();
		logger.info("Verifying user is navigated to login page.");
		loginpage.verifyIfLoginPageIsLoaded();
		logger.info("Entering Credentials");
		loginpage.enterCredentials();
	}
	
	
	

}
