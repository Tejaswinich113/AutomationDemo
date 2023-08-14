package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Demo1 {
	
	@Test
	public void test() {
		Response res = RestAssured.get("https://10.82.180.36:8080/AmigoWallet/RegistrationAPI/getAllQuestions");
		ResponseBody resbody = res.getBody();
		String body = resbody.asString();
		System.out.println(body);
	}
}
