package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Demo2 {
	
	@Test
	public void test() {
		RestAssured.baseURI = "https://10.82.180.36:8080/AmigoWallet/RegistrationAPI";
		RequestSpecification requestspecification = RestAssured.given();
		Response response = requestspecification.get("/getAllQuestions");
		System.out.println(response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
