package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
public class GetOneEmpAPI {
	private RequestSpecification request;
	public static Response response;
	
	
	@Given("user calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {
		request=given().header("Content-Type","application/json")
		.header("Authorization", SyntaxAPIAuthenticationSteps.Token)
		.param("employee_id", "3559");
		
		//request.body(CommonMethods.readJson(
			//	"C:\\Users\\MelekAsim\\eclipse-workspace\\HrmsCucumberFramework\\src\\test\\resources\\JSONFiles\\getOneEmployee.json"));
	    
	}

	@When("user retrieves getOneEmployee response")
	public void user_retrieves_getOneEmployee_response() {
		response= request.get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
	    System.out.println(response.prettyPrint());
	}

	@Then("user get oneEmployee code is {int}")
	public void user_get_oneEmployee_code_is(Integer expectedCode) {
		 Integer  actualCode=response.getStatusCode();
		   System.out.println("Actual status code "+actualCode);
		    Assert.assertEquals(expectedCode, actualCode);
	    
	}

	@Then("user validates getOneEmployee displayed")
	public void user_validates_getOneEmployee_displayed() {
		boolean isDisplayed =response.prettyPrint().contains("employee_id");
		System.out.println(isDisplayed);
		Assert.assertTrue("employee_id is not displayed ", isDisplayed);
	    
	}
	

}
