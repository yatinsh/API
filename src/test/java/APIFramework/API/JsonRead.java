package APIFramework.API;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead 
{
	public static void main(String[] args) throws IOException, JSONException 
	{
		File f=new File("../API/body.json");
		FileInputStream fi=new FileInputStream(f);
		
		InputStreamReader targetReader = new InputStreamReader(fi);
		JSONTokener jt=new JSONTokener(targetReader);
		
		JSONObject j=new JSONObject(jt);
		//System.out.println(j.toString());
		
		JSONObject address=j.getJSONObject("address");
		
		JSONArray phone=j.getJSONArray("phoneNumbers");
//		 JSONObject j1=phone.getJSONObject(0);
//		 j1.put("number","9899777287");
//	
//		 System.out.println(j);
		int l=phone.length();
		for(int i=0;i<l;i++)
		{
			JSONObject j1=phone.getJSONObject(i);
			System.out.println(j1.get("number"));
		}

		
	}

}
