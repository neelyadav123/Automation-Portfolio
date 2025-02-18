package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class Testcase2 extends BaseTest {
	
	HomePageEvents hp = new HomePageEvents();
	LoginPageEvents lp = new LoginPageEvents();
	
  @Test
  public void verifyingSignUp() {
	  logger.info("Navigating to Sign in page.");
	  hp.signInPageButton();
	  logger.info("Entering signup details and clicking on Signin button.");
	  lp.enterSignInDetails();
	  
  }
}
