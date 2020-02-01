package com.hrms.steps;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReviewLogSteps extends CommonMethods{
	
	
	LoginPageElements login;
	
	@Given("user is already on Login page")
	public void user_is_already_on_Login_page() {
	    CommonMethods.setUp();
	}

	@When("user enters valid username as {string} and password as {string}")
	public void user_enters_valid_username_and_password(String userName, String pass) {
	     login=new LoginPageElements();
	    sendText(login.username, userName);
	    sendText(login.password, pass);
	    
	    
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		login=new LoginPageElements();
		click(login.loginBtn);
	   	}

	@Then("user sees that dashboard is displayed")
	public void user_sees_that_dashboard_is_displayed() {
	   System.out.println("LoggedIn");
	}


}
