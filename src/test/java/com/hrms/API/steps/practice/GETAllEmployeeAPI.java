package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class GETAllEmployeeAPI {
	private Response response;
	private static RequestSpecification request;

@Given("user calls getAllEmployees API")
public void user_calls_getAllEmployees_API() {
	request = given().header("Content-Type", "application/json").header("Authorization",
			SyntaxAPIAuthenticationSteps.Token);

    
}

@When("User retrieves response for getAllEmployees API")
public void user_retrieves_response_for_getAllEmployees_API() {
	System.out.println(request.log().all());
	response=request.get(APIConstants.GET_ALL_EMP_URL);
	//response.prettyPrint();
    
}

@Then("status code is {int} for getAllEmployeeAPI")
public void status_code_is_for_getAllEmployeeAPI(Integer expectedStatus) {
	//int statusCode = response.getStatusCode();
	//response.then().assertThat().statusCode(int1);
	response.then().assertThat().statusCode(expectedStatus);

	// 2nd way, using JUnit Assert
	Integer actualStatus = response.statusCode();
	Assert.assertEquals(expectedStatus, actualStatus);
}

@Then("user validates getAllEmployees exist")
public void user_validates_getAllEmployees_exist() {
	JSONObject json = new JSONObject(response.prettyPrint());
	JSONArray array = json.getJSONArray("Employee");
	System.out.println("Size of list for returned Employee is: "+array.length());
	
	for(int i=0;i<=array.length()-1;i++) {
		 //"emp_firstname": "SyntaxAPIInstructor",
		  String createdEmployee=response.jsonPath().getString("Employee["+i+"].emp_firstname");
		  if(createdEmployee.equals("albana23")) {
			  response.then().body("Employee["+i+"].emp_lastname", equalTo("dmrbg1258"));
			  response.then().body("Employee["+i+"].emp_middle_name", equalTo("s"));
			  response.then().body("Employee["+i+"].emp_gender", equalTo("1"));
			  response.then().body("Employee["+i+"].emp_birthday", equalTo("2005-02-23"));
			  response.then().body("Employee["+i+"].emp_status", equalTo("internee"));
			  response.then().body("Employee["+i+"].emp_job_title", equalTo("Cloud Architect"));
			  System.out.println("Employee is found!!!!!");
			  break;
		  }else {
			  //System.out.println("Employee is NOT found!!!!!");
		  }

	}
}}

