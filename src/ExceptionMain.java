import java.util.concurrent.TimeoutException;


public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExceptionOne classone=new ExceptionOne();
		      try{
		      classone.checkNull();
		      int val=1/0;
		      }catch(TimeoutException error){
		    	  
		    		  System.out.println("inside TimeoutException: "+error.getMessage());
		    	  
		    	  
		      }catch(NullPointerException error){
		    	  if(error instanceof NullPointerException){
		    		  System.out.println("inside nullpointerexception: "+error.getMessage());
		    	  }
		    	  
		      }catch(Exception error){
		    	  if(error instanceof Exception){
		    		  System.out.println("inside Exception:"+ error.getMessage());
		    	  }
		    	 
			  }
      
	}

}
