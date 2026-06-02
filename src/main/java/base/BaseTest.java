package base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utilities.ConfigReader;

public class BaseTest {

@BeforeClass

public void setup(){

RestAssured.baseURI =

ConfigReader.getProperty(
"baseURL");

}

}