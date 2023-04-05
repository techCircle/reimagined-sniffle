package restAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

public class statusValidationTest {
	
	

	String APIKey = "4fc25c02a5f9c1262c847f587b2837f8";	
	String OAuthToken = "ATTA6c80aa601dab8d160c13b42076c3af600e3924f7565bb30c0c1b09fc3ed83adbA2B4A39C";	
	
	@Test
	public void validateData() {
		
		RequestSpecification httpRequest = RestAssured.given();
		
		
		httpRequest.given()
		.param("key", APIKey)
		.param("token", OAuthToken)
		.get("https://api.trello.com/1/members/me/boards")
		.then()
		.statusCode(200)
		.body("name", hasItems( "restAssuredBoard", "TestingPostman"))
		.body("id", hasItems("603eedcffb6d6e091e215a04"));
		
		
		
		
		
		
	}

}
