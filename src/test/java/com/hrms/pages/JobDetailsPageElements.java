package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class JobDetailsPageElements {
	@FindBy(linkText="Job")
	public WebElement JobBtn;
	
	@FindBy(id="btnSave")
	public WebElement editSave;
	
	@FindBy(id="job_job_title")
	public WebElement jobTitle;
	
	@FindBy(id="job_emp_status")
	public WebElement jobStatus;
	
	@FindBy(id="job_eeo_category")
	public WebElement jobCategory;
	
	@FindBy(id="job_joined_date")
	public WebElement joindate;
	
	@FindBy(id="job_sub_unit")
	public WebElement subunit;
	
	@FindBy(id="job_location")
	public WebElement location;
	
	
	@FindBy(id="job_contract_start_date")
	public WebElement startDate;
	
	@FindBy(id="job_contract_end_date")
	public WebElement endDate;
	
	public JobDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	

}
