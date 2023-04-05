package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getBoards {
	
	
	String APIKey = "4fc25c02a5f9c1262c847f587b2837f8";	
	String OAuthToken = "ATTA6c80aa601dab8d160c13b42076c3af600e3924f7565bb30c0c1b09fc3ed83adbA2B4A39C";	
	
	
	@Test
	public void getBoards() {
		
		// set the base URL
				RestAssured.baseURI = "https://api.trello.com/1/members/me/boards";

				// create request object
				RequestSpecification httpRequest = RestAssured.given();
		
				
				Response myResponse = httpRequest.get(RestAssured.baseURI+"?key="+APIKey+"&token="+OAuthToken);
		
			
		
				System.out.println(myResponse.prettyPrint());
				
				Assert.assertEquals(200, myResponse.getStatusCode());
				
				
		
				
	}
	
	
	
	
	
	
	
	
	
	

}
