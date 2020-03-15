package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.ContactDetailsPageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeesListPage;
import com.hrms.pages.JobDetailsPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitiliazer extends BaseClass{
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;
	protected static ContactDetailsPageElements contdetails;
	protected static EmployeesListPage emplList;
	protected static JobDetailsPageElements jobDtls;
	
	public static void initializeAllPage(){
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
		contdetails=new ContactDetailsPageElements();
		emplList = new EmployeesListPage();
		jobDtls =new JobDetailsPageElements();
	}

}
