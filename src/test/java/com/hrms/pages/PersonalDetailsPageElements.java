package com.hrms.pages;

	import java.util.List;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.hrms.testbase.BaseClass;

	public class PersonalDetailsPageElements {
		@FindBy(id="empPic")
		public WebElement empPicture;
		
		@FindBy(xpath="//div[@id='profile-pic']/h1")
		public WebElement nameOnPicture;
		
		@FindBy(id="personal_txtEmployeeId")
		public WebElement empId;
		
		@FindBy(id="btnSave")
		public WebElement edit_saveBtn;
		
		@FindBy(xpath="//input[@id='personal_txtLicenNo']")
		public WebElement driverLicenseNo;
		
		
		@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
		public WebElement driverLicenseExp;
		
		@FindBy(id="personal_txtNICNo")
		public WebElement SSNNo;
		
		@FindBy(id="personal_txtSINNo")
		public WebElement SINNo;
		
		//@FindBy (xpath="//input[@id='personal_optGender_1']")
		//public WebElement maleBtn;
		
		//@FindBy (xpath="//input[@id='personal_optGender_2']")
		//public WebElement femaleBtn;
		
		@FindBy (id="personal_cmbMarital")
		public WebElement MaritalStatusBtn;
		
		@FindBy (id="personal_cmbNation")
		public WebElement nationality;
		
		@FindBy (id="personal_DOB")
		public WebElement dobCalendar;

		 @FindBy(xpath = "//label[contains(@for,'personal_optGender')]")
		  public List<WebElement> gender;
		
		public PersonalDetailsPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
}
