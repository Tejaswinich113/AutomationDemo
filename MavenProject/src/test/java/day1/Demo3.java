package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Demo3 {
	
	@Test
	public void test() {
		Response res = RestAssured.get("https://10.82.180.36:8080/AmigoWallet/RegistrationAPI/getAllQuestions");
		System.out.println(res.getBody().asString());
		int statuscode = res.getStatusCode();
		System.out.println(statuscode);
		String statusline = res.getStatusLine();
		System.out.println(statusline);
		String contenttype = res.getContentType();
		System.out.println(contenttype);
		String sessionid = res.getSessionId();
		System.out.println(sessionid);
		
		Headers headers = res.getHeaders();
		for(Header header:headers) {
			System.out.println("Name of the Header: " +header.getName());
			System.out.println("value of the value: " +header.getValue());
		}
	}

}
