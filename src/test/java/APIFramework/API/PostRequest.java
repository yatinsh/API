
package APIFramework.API;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) 
	{
		AddressDetails[] address=new AddressDetails[2];
		address[0]=new AddressDetails();
		address[0].setHouseno("c-94");
		address[0].setLandmark("nearby jaypee");
		address[0].setSector("sector-8");
		
		address[1]=new AddressDetails();
		address[1].setHouseno("c-95");
		address[1].setLandmark("nearby jaypee showroom");
		address[1].setSector("sector-8");
		
		BasicInformation body=new BasicInformation();
		body.setFirstname("yatin");
		body.setLastname("sharma");
		body.setId("EMP 4908");
		body.setAge("27");
		body.setDesignation("software quality analyst");
		body.setAddress(address);
		
		
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post("http://localhost:3000/comments");
		
		System.out.println("status code is:"+res.statusCode());
		System.out.println("response data is:"+res.asString());

	}

}
