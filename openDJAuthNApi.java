package hahah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class hahaha {
   public static void main(String[] args)   {
		
	   System.out.println(DJAuthAPI("a123", "Credit4321"));			
		 
   }
   
   public static String DJAuthAPI(String usr, String pwd)  {
	
	  if ((usr == null || usr == "") || (pwd == null || pwd == "")) {
		  return null;
	  }
	  
	  String output = null;
	  
	  try {
			URL url = new URL("http://tu-mtfrdj-01.cac.com:8080/api/users/" + usr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("x-openidm-password", pwd);
			conn.setRequestProperty("x-openidm-username", usr);
			
			if (conn.getResponseCode() != 200) {
				output = "AuthN Failed";
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());		
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			output = br.readLine();	
			
			conn.disconnect();

		  } catch (Exception e) {
			  
			//e.printStackTrace();
		  } 
	  	return output;
	}
}