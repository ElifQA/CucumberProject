package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ReportsPageElements {
	
	@FindBy(xpath="//input[@id='search_search']")
	public WebElement reportSearch;
	
	@FindBy (xpath="//input[@class='searchBtn']")
	public WebElement searchBtn;
	
	@FindBy (xpath="//table /tbody/tr/td")
	public WebElement invalidReport;
	
	@FindBy (xpath="//table /tbody/tr/td [2]")
	public WebElement validReport;
	
	public ReportsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}

}
