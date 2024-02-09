package examples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DemoTest {
  @Test
  public void f() {
	  RestAssured.baseURI="https://rahulshettyacademy.com";
	  RestAssured.given().log().all().body("{\n"
	  		+ "  \"location\": {\n"
	  		+ "    \"lat\": -38.383494,\n"
	  		+ "    \"lng\": 33.427362\n"
	  		+ "  },\n"
	  		+ "  \"accuracy\": 50,\n"
	  		+ "  \"name\": \"Frontline house\",\n"
	  		+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
	  		+ "  \"address\": \"29, side layout, cohen 09\",\n"
	  		+ "  \"types\": [\n"
	  		+ "    \"shoe park\",\n"
	  		+ "    \"shop\"\n"
	  		+ "  ],\n"
	  		+ "  \"website\": \"http://google.com\",\n"
	  		+ "  \"language\": \"French-IN\"\n"
	  		+ "}\n"
	  		+ " \n"
	  		+ "").when().post("/maps/api/place/add/json")
	  .then().log().all().statusCode(200);
  }
}
