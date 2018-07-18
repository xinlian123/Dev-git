package helloworld;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class twilio {
  public static void main(String arg[]) {
	  String code = "4567890";
	  String to = "4199212177";
	  twilio(code);
  }

 /*public static void twilio(String code) {
	    try {
	    String url = "http://tu-mtfrinvdj-01.cac.com:8080/api/users/?_action=create";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("x-openidm-password", "zFY6zLEatqI59d4j");
		con.setRequestProperty("x-openidm-username", "svcCaps");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		con.setRequestProperty("cache-control", "no-cache");
		con.setRequestProperty("content-type", "application/json");

		String urlParameters = "{\"_id\":\"xinTest4\",\"_schema\":\"frapi:opendj:rest2ldap:user:1.0\",\"password\":\"Testing123\",\"displayName\":\"xinTest4\",\"lastname\":\"lian\"}";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		//String responseMSG = con.;
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
		//System.out.println("Response msg : " + responseMSG);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
	    }
	    catch (Exception e) {
	    	
	    }
  }*/
  
  /*public static void twilio(String oCode, String phoneNum) {
	    
	  try {
	    String url = "http://internalwstst.creditacceptance.com/customerContactHub/sendmessage";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		con.setRequestProperty("cache-control", "no-cache");
		con.setRequestProperty("content-type", "application/json");

		String urlParameters = "{\"callingSystem\":\"IDM\",\"messageTemplate\":\"IDM_OTP\",\"communicationChannel\":\"TEXT\",\"messageFields\":{\"oneTimePass\":\"" + oCode + "\"},\"sendTo\":{\"phoneNumber\":\"" + phoneNum + "\"}}";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
		//System.out.println("Response msg : " + responseMSG);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
	    }
	    catch (Exception e) {
	    	
	    }
}
*/
 
 public static void twilio(String code) {
	    try {
	    String url = "https://api.twilio.com/2010-04-01/Accounts/AC36472d79395800f12fc9d7fc992905a2/Messages.json";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("authorization", "Basic QUMzNjQ3MmQ3OTM5NTgwMGYxMmZjOWQ3ZmM5OTI5MDVhMjo3NTA1ZWFhZWQyOGE1NzZiMTBjY2YyMDQxMDlhZGE5ZQ==");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		con.setRequestProperty("cache-control", "no-cache");
		con.setRequestProperty("content-type", "application/x-www-form-urlencoded");

		String urlParameters = "To=4199212177&From=%2B14408398878&Body=Please enter the code: " + code;

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
	    }
	    catch (Exception e) {
	    	
	    }
}
}
