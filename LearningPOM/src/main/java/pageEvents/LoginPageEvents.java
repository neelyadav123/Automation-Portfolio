package pageEvents;

import org.testng.Assert;

import base.BaseTest;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents extends BaseTest {
	ElementFetch ele = new ElementFetch();
	
	public void verifyIfLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element Not Found");
	}
	
	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("neelyadav123@gamil.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("Neel@ert");
	}
	
	public void enterSignInDetails() {
		ele.getWebElement("XPATH", LoginPageElements.signUpname).sendKeys("Neel");
		ele.getWebElement("XPATH", LoginPageElements.signUpEmail).sendKeys("neelyadav@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.signUpButton).click();
		
	}
}
