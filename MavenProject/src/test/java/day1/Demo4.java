package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {
	
	@Test
	public void test() {
		RestAssured.baseURI = "https://10.82.180.36:8080/AmigoWallet/RegistrationAPI";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "/getAllQuestions");
		System.out.println(response.getBody().asString());
		String contenttype = response.header("Content-Type");
		System.out.println(contenttype);
		String te = response.header("transfer-Encoding");
		System.out.println(te);
		String date = response.header("date");
		System.out.println(date);
		String aspversion = response.header("asp_net_version");
		System.out.println(aspversion);
	}

}
