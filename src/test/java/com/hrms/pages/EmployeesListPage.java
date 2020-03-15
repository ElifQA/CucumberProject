package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeesListPage {
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement emplNameSearch;

	@FindBy(id = "empsearch_id")
	public WebElement emplIDsearch;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[2]")
	public WebElement empIdBtn;
	
	public EmployeesListPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
