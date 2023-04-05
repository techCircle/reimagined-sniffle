package restAssuredTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createBoards {
	
	
	String APIKey = "4fc25c02a5f9c1262c847f587b2837f8";	
	String OAuthToken = "ATTA6c80aa601dab8d160c13b42076c3af600e3924f7565bb30c0c1b09fc3ed83adbA2B4A39C";	
	String boardName = "restAssuredBoard";
	
	@Test
	public void createBoard() {
		
		// set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/boards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+APIKey+"&token="+OAuthToken);
		
		int statusCode = myResponse.getStatusCode();
		
		AssertJUnit.assertEquals(200, statusCode);
		
		System.out.println("The test passed and board created with status Code- "+ statusCode);
		
	}
	
	
	
	
	
	
	
	
	

}
