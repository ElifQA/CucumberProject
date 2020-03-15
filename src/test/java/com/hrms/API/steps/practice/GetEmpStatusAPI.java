package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.hrms.utils.APIConstants;


public class GetEmpStatusAPI {
	private RequestSpecification request;
	public static Response response;

	
	@Given("user calls getEmployeeStatus API")
	public void user_calls_getEmployeeStatus_API() {
		request = given().header("Content-Type","application/json")
				.header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	    
	}

	@When("user retrieves getEmployeeStatus response")
	public void user_retrieves_getEmployeeStatus_response() {
		response=request.get(APIConstants.get_Emp_Status_URL);
		
		System.out.println(response.prettyPrint());
	   
		
	}

	@Then("user get EmployeeStatus code is {int}")
	public void user_get_EmployeeStatus_code_is(int int1) {
		response.then().assertThat().statusCode(int1);	    
	}

	@Then("user validates all employee status displayed")
	public void user_validates_all_employee_status_displayed() {
	   //boolean isDisplayed=response.prettyPrint().contains("Worker");
	   //Assert.assertTrue("Getting all employee status is not displayed", isDisplayed);
	   JSONObject json = new JSONObject(response.prettyPrint());
		JSONArray array = json.getJSONArray("Employee Status List");
		for (int i = 0; i <= array.length() - 1; i++) {
			System.out.println(array.get(i));
			if (i == 0) {
				Assert.assertEquals("Employee", array.get(i));
			}else if(i==1) {
				Assert.assertEquals("Worker", array.get(i));
			}else if(i==2) {
				Assert.assertEquals("Self-Employee", array.get(i));
			}else if(i==3) {
				Assert.assertEquals("Independent contractor", array.get(i));
			}else if(i==4) {
				Assert.assertEquals("Freelance", array.get(i));
			}else if(i==5) {
				Assert.assertEquals("Zero hours contract", array.get(i));
			}else if(i==6) {
				Assert.assertEquals("Gig economy", array.get(i));
			}else if(i==7) {
				Assert.assertEquals("Self-employe", array.get(i));
			}else if(i==8) {
				Assert.assertEquals("internee", array.get(i));
			}
		}
		Assert.assertEquals(9, array.length());
		System.out.println(array.length());
	   
	}

}
