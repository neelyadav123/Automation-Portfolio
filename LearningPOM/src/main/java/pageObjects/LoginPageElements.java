package pageObjects;

public interface LoginPageElements {
  String emailAddress = "//input[@data-qa='login-email']";
  String passwordField = "//input[@placeholder='Password']";
  String loginText = "//button[contains(text(),'Login')]";
  String signUpname = "//input[@placeholder='Name']";
  String signUpEmail = "//input[@data-qa='signup-email']";
  String signUpButton = "//button[normalize-space()='Signup']";
  
  
}
