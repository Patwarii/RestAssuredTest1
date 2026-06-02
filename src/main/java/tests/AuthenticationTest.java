package tests;

import static io.restassured.RestAssured.*;
import com.aventstack.extentreports.*;
import reports.ExtentManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.Routes;
import io.restassured.response.Response;
import payload.AuthPayload;

public class AuthenticationTest extends BaseTest {

	ExtentReports extent =
			ExtentManager.getReport();

			ExtentTest test;

@Test

public void authenticateUser() {

test = extent.createTest(
"Authenticate API Test");

Response response =

given()

.relaxedHTTPSValidation()

.header(
"Content-Type",
"application/json")

.body(
AuthPayload.requestBody())

.when()

.post(
Routes.AUTHENTICATE)

.then()

.log().all()

.extract().response();

test.pass(
"API Executed Successfully");

Assert.assertEquals(
response.statusCode(),
200);

test.pass(
"Status Code Validated");

extent.flush();

}
}