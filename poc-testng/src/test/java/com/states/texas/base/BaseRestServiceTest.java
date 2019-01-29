package com.states.texas.base;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseRestServiceTest {
	
	protected CloseableHttpClient client; 
	protected CloseableHttpResponse response;
	
	@BeforeMethod(description="Get Client")
	public void getServiceClient(){
		
		client =  HttpClientBuilder.create().build();		
		
	}
	
	@AfterMethod(description="Closing Connection")
	public void close() throws IOException{
		
		client.close();
		response.close();
	}

}
