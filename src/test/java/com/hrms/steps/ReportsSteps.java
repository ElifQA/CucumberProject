package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.ReportsPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ReportsSteps extends CommonMethods{
	ReportsPageElements report;
	
	@Given("I navigated to the Reports Page")
	public void i_navigated_to_the_Reports_Page() {
		DashboardPageElements dashboard=new DashboardPageElements();
		dashboard.navigateToReports();
	}

	@When("I enter invalid report")
	public void i_enter_invalid_report() {
		 report=new ReportsPageElements();
		sendText(report.reportSearch, "secret");
		
	}

	@When("I click search button")
	public void i_click_search_button() {
	    click(report.searchBtn);
	}

	@Then("I see no record found message")
	public void i_see_no_record_found_message() {
		report=new ReportsPageElements();
		boolean msg=report.invalidReport.isDisplayed();
		Assert.assertTrue("invalid report", msg);
	

	    
	}
	@When("I enter valid {string} report")
	public void i_enter_valid_report(String string) {
		report=new ReportsPageElements();
		sendText(report.reportSearch, string);
	}

	

	@Then("I see the search {string} is displayed")
	public void i_see_the_search_report_is_displayed(String string) {
		boolean reportmsg=report.validReport.isDisplayed();
		Assert.assertTrue(reportmsg);
	
		
	}
	@When("I search {string} report should match or give error message {string}")
	public void i_search_report_should_match_or_give_error_message(String reportname, String string2) {
	    report=new ReportsPageElements();
	    sendText(report.reportSearch,reportname);
	}

	
	
	

}
