package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITest {
	/**
	 * Below are hard coded examples using REST assured
	 * 
	 */
	//@Test
	public void getAllJobTitles() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				" Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzExOTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjM5NywidXNlcklkIjoiMzUzIn0.oIUk8TGdDqEDfzM2-4CbRuW39zSkAiXpquXJHG79jFE")
				.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}
	//@Test
	public void getOneEmployee() {
		Response response = RestAssured.given().param("employee_id", "3552").contentType("application/json").header("Authorization",
				" Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzExOTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjM5NywidXNlcklkIjoiMzUzIn0.oIUk8TGdDqEDfzM2-4CbRuW39zSkAiXpquXJHG79jFE")
		.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
		
		response.prettyPrint();
	
	}
	/*
	 * TASK: getAllEmployeeStatuses Pretty print print status code
	 * 
	 */
	@Test
	public void getAllEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
			"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzExOTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjM5NywidXNlcklkIjoiMzUzIn0.oIUk8TGdDqEDfzM2-4CbRuW39zSkAiXpquXJHG79jFE")
			.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");

	response.prettyPrint();
	int actualStatusCode = response.getStatusCode();
	Assert.assertEquals(200, actualStatusCode);
	
	}
	@Test
	public void getAllEmployeeStatuses() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
			" Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzExOTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjM5NywidXNlcklkIjoiMzUzIn0.oIUk8TGdDqEDfzM2-4CbRuW39zSkAiXpquXJHG79jFE")
			.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);
		System.out.println(actualStatusCode);
		
}
//	@Test
//	public void createEmployee() {
//		//Response response=RestAssured.given().contentType("application/json").header("Authorization",
//	Response response = RestAssured.given().urlEncodingEnabled(true).header("Authorization",			
//	"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzExOTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjM5NywidXNlcklkIjoiMzUzIn0.oIUk8TGdDqEDfzM2-4CbRuW39zSkAiXpquXJHG79jFE")
//				
//			.body("{\n  \"emp_firstname\": \"Suley1maqnNew\",\n   \"emp_lastname\": \"OZA1Y\",\n    \"emp_middle_name\": \"Senior\\\",\n    \"emp_gender\": \"2\",\n    \"emp_birthday\": \"1974-02-19\",\n    \"emp_status\": \"Worker\",\n    \"emp_job_title\": \"Cloud Consultant\"\n}\"")
//	
//	.param("emp_firstname", "newName")
//	.param("emp_lastname", "employee")
//	.param("emp_middle_name", "syntax")
//	.param("emp_gender", "2")
//	.param("emp_birthday", "1991-04-22")
//	.param("emp_status", "Employee")
//	.param("emp_job_title", "Developer")
//	.contentType("application/json")
//			
//	
//		.when().get("http://54.167.125.15/syntaxapi/api/​createEmployee.php");
//		response.prettyPrint();
//		int actualStatusCode = response.getStatusCode();
//		Assert.assertEquals(200, actualStatusCode);
//		
		
		

//}

}






