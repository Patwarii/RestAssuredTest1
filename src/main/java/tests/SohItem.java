package tests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import endpoints.Routes;
import io.restassured.response.Response;
import payload.SohItemPayLoad;
import reports.ExtentManager;

public class SohItem extends BaseTest {

	ExtentReports extent = ExtentManager.getReport();

	ExtentTest test;

	@Test

	public void sohOfItemDetails() {
		test = extent.createTest("SOH API Test");

		Response response =

				given()

						.relaxedHTTPSValidation()

						.header("Content-Type", "application/json")

						.body(SohItemPayLoad.requestBody())

						.when()

						.post(Routes.SOH)

						.then()

						.log().all().extract().response();

		test.pass("API Executed Successfully");

		Assert.assertEquals(response.statusCode(), 200);

		test.pass("Status Code Validated");

		extent.flush();

	}
}
