package APIFramework.API;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PostRequestWithOrgJSON 
{

	public static void main(String[] args) throws JSONException 
	{
//		JSONObject j=new JSONObject();
//		j.put("firstname","yatin");
//		j.put("lastname","sharma");
//		j.put("id","EMP 4910");
//		j.put("age","27");
//		j.put("designation","software automation engineer");
//		
//		
//		JSONObject j1=new JSONObject();	
//		j1.put("firstname","monika");
//		j1.put("lastname","sharma");
//		j1.put("id","EMP 4911");
//		j1.put("age","27");
//		j1.put("designation","goverment teacher");
//		
//		j.put("new candidate",j1);
		
		JSONObject j=new JSONObject();
		JSONObject j01=new JSONObject();
		j01.put("fname","yatin");
		j01.put("lname","sharma");
		j01.put("age","27");
		j01.put("id","4912");
		
		JSONArray j02=new JSONArray();
		
		JSONObject j1=new JSONObject();
		j1.put("city","aligarh");
		j1.put("state","UP");
		j1.put("address","jamirabad");
		
		JSONObject j2=new JSONObject();
		j2.put("city","noida");
		j2.put("state","UP");
		j2.put("address","greenowest");
		
		j02.put(0,j1);
		j02.put(1,j2);
		
		j.put("basic info",j01);
		j.put("address details",j02);
		
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(j.toString())
		.when()
		.post("http://localhost:3000/comments");

		System.out.println("status code:"+res.statusCode());
		System.out.println("response data:"+res.asString());
	}

}
