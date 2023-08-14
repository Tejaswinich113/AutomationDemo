package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Demo5 {
	
	@Test
	public void test() {
		Response response = RestAssured.get("http://10.82.180.36:8080/rest-session-demo/api/students/filter/V");
		System.out.println(response.getBody().asString());
		JsonPath jsonpath = response.jsonPath();
		System.out.println(jsonpath.getString("std"));
		System.out.println(jsonpath.getString("name"));
		System.out.println(jsonpath.getString("rollNo"));
		System.out.println(jsonpath.getString("links"));
	}
	
	@Test
	public void test1() {
		Response res = RestAssured.get("http://10.82.180.36:8080/rest-session-demo/api/students/filter/V");
		System.out.println(res.getBody().asString());
		JsonPath jsonpath = new JsonPath(res.getBody().asString());
		System.out.println(jsonpath.getString("std"));
		System.out.println(jsonpath.getString("name"));
		System.out.println(jsonpath.getString("rollNo"));
		System.out.println(jsonpath.getString("links"));
	}
	
	@Test
	public void test2() {
		Response res1 = RestAssured.get("http://10.82.181.42/WebService/Bank/Bank.asmx/ReadUser?username=infy");
		System.out.println(res1.getBody().asString());
		XmlPath xmlpath = res1.xmlPath();
		System.out.println(xmlpath.getString("user.userid"));
		System.out.println(xmlpath.getString("user.passwod"));
		System.out.println(xmlpath.getString("user.balance"));
		System.out.println(xmlpath.getString("user.status"));
	}
	
	@Test
	public void test3() {
		Response res2 = RestAssured.get("http://10.82.181.42/WebService/Bank/Bank.asmx/ReadUser?username=infy");
		System.out.println(res2.getBody().asString());
		XmlPath xmlpath = new XmlPath(res2.getBody().asString());
		System.out.println(xmlpath.getString("user.userid"));
		System.out.println(xmlpath.getString("user.passwod"));
		System.out.println(xmlpath.getString("user.balance"));
		System.out.println(xmlpath.getString("user.status"));
	}
}
