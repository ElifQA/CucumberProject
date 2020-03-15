package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ContactDetailsPageElements {
	
	@FindBy(linkText="Contact Details")
	public WebElement contBtn;
	
	
	@FindBy(id="contact_street1")
	public WebElement address1;
	
	@FindBy(id="contact_street2")
	public WebElement address2;
	
	@FindBy(id="contact_city")
	public WebElement city;
	
	@FindBy(id="contact_province")
	public WebElement state;
	
	@FindBy(id="contact_emp_zipcode")
	public WebElement zipCode;
	
	@FindBy(id="contact_country")
	public WebElement country;
	
	@FindBy(id="contact_emp_hm_telephone")
	public WebElement hPhone;
	
	@FindBy(id="contact_emp_mobile")
	public WebElement mobPhone;
	
	@FindBy(id="contact_emp_work_telephone")
	public WebElement workPhone;
	
	@FindBy(id="contact_emp_work_email")
	public WebElement workEmail;
	
	@FindBy(id="contact_emp_oth_email")
	public WebElement othEmail;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
	
	public ContactDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
