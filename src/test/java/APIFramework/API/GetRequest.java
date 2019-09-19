package APIFramework.API;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) 
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/comments/EMP 4908");
		//.get("http://localhost:3000/posts");
		System.out.println(res.statusCode());
		//System.out.println(res.asString());
		
		String houseno=res.jsonPath().get("address[1].houseno");	//extraction of houseno
		System.out.println(houseno);
	}

}
