package com.states.texas.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.states.texas.base.BaseRestServiceTest;

public class RestApiTest extends BaseRestServiceTest {
  
	@BeforeMethod(description="Setting Up the Connections")
	public void setUp() throws ClientProtocolException, IOException{
		response = client.execute(new HttpGet("http://dummy.restapiexample.com/api/v1/employees"));
		
	}
	
	@Test(description="Verify the Rest Response")
  public void restServiceVerificationTest() throws UnsupportedOperationException, IOException, ParseException {
		
		//Arrange
		
		
		//Act
		
		
		//Assert
		
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(response.getEntity().getContentType().toString(),"Content-Type: text/html; charset=UTF-8");
		String result = EntityUtils.toString(response.getEntity());
		System.out.println(result);
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(result);
		JSONArray array = new JSONArray();
		array.add(obj);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		

		
		System.out.println();

		
  }
}
