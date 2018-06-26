package helloworld;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class twilio {
  public static void main(String arg[]) {
	  String code = "123";
	  twilio(code);
  }
  public static void twilio(String code) {
	    try {
	    String url = "https://api.twilio.com/2010-04-01/Accounts/AC36472d79395800f12fc9d7fc992905a2/Messages.json";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

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
