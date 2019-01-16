import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeoutException;


public class ExceptionOne {

	public void checkNull() throws TimeoutException{
		 
				try{
					String str="1123";
					System.out.println (str.length());
				}
			        catch(NullPointerException e){
					throw new NullPointerException("NullPointerException..");
				}
				
		 
				
				try{
					 String str="http://www.google.com";
					  
					 
					    HttpURLConnection httpURLConnection=null;
					    httpURLConnection.setConnectTimeout(3000);
					    URL url = new URL(str);
						 httpURLConnection = (HttpURLConnection) url.openConnection();
						
					
				}catch(Exception error){
					throw new TimeoutException("throwing timeoutexception");
				}
				
				
			   
	}
}
