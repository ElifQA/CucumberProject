package com.hrms.API.steps.practice;

//import org.junit.Assert;
//
//import com.hrms.utils.CommonMethods;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import static io.restassured.RestAssured.*;
//
//public class UpdateEmpAPI {
//	
//	private Response response;//request always changes we do limited private one execution
//	public static RequestSpecification request;
//	
//	@Given("user calls ubdate Employee API")
//	public void user_calls_ubdate_Employee_API() {
//		request = given().header("Content-Type","application/json")
//				.header("Authorization", SyntaxAPIAuthenticationSteps.Token);
//	  
//		request.body(CommonMethods.readJson(
//    		"C:\\Users\\MelekAsim\\eclipse-workspace\\HrmsCucumberFramework\\src\\test\\resources\\JSONFiles\\updateEmp.json"));
//}
//
//	@When("user retrieves ubdate response")
//	public void user_retrieves_ubdate_response() {
//    response = request.put("http://54.167.125.15/syntaxapi/api/updateEmployee.php");
//    System.out.println(response.prettyPrint());
//}
//
//	@Then("user get status code {int}")
//	public void user_get_status_code(Integer expectedCode) {
//		Integer actualStatusCode = response.getStatusCode();
//		System.out.println("Actual code is: " +actualStatusCode);
//		
//		Assert.assertEquals(expectedCode, actualStatusCode);
//}
//
//	@Then("user validates employee is ubdated")
//	public void user_validates_employee_is_ubdated() {
//    boolean isUpdated= response.getBody().asString().contains("Entry updated");
//    Assert.assertTrue("Employee is not updated", isUpdated);
//}
//
//
//}
