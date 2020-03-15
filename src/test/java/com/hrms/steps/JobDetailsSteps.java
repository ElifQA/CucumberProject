package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobDetailsSteps extends CommonMethods {
	@When("Clicking on PIM at dashboard")
	public void clicking_on_PIM_at_dashboard() {
		click(dashboard.pim);
	    	}

	@Then("Clicking on EmployeeList")
	public void clicking_on_EmployeeList() {
		click(dashboard.listEmpl);

	}

	@When("I enter employee id")
	public void i_enter_employee_id() throws InterruptedException {
		//waitForClick(emplList.emplIDsearch);
		Thread.sleep(3000);
		sendText(emplList.emplIDsearch, "6773");
	}
	@When("I click search button on job Details")
	public void i_click_search_button_on_job_Details() throws InterruptedException {
		Thread.sleep(3000);
	click(emplList.searchButton);
	}
	
		
		
	@Then("I click employee name")
	public void i_click_employee_name() {
		click(emplList.empIdBtn);
	}

	@When("I click on Job button")
	public void i_click_on_Job_button() {
	    click(jobDtls.JobBtn);
	}

	@When("I click Edit button on Job Details")
	public void i_click_Edit_button_on_Job_Details() {
	    click(jobDtls.editSave);
	}

	@Then("I am able to add Job Details")
	public void i_am_able_to_add_Job_Details() throws InterruptedException {
		
		selectDdValue(jobDtls.jobTitle, "Tester");
				
		selectDdValue(jobDtls.jobStatus, "Employee");
		
		selectDdValue(jobDtls.jobCategory, "Professionals");

		
		//waitForClickability(jobDtls.joindate);
		Thread.sleep(3000);
		click(jobDtls.joindate);
		//Thread.sleep(3000);
		sendText(jobDtls.joindate, "2020-02-03");
		
		Thread.sleep(3000);
		//waitForClickability(jobDtls.startDate);
		click(jobDtls.startDate);
		Thread.sleep(3000);
		sendText(jobDtls.startDate, "2020-02-25");
		Thread.sleep(3000);
		click(jobDtls.endDate);
		sendText(jobDtls.endDate, "2020-02-30");
		
		click(jobDtls.editSave);
		
		
		
		
		
		
		
		
	}

}
