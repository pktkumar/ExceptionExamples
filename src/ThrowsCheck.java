
public class ThrowsCheck  {
	
	public String testThrows() throws NullPointerException{
		try{
			String str=null;
			System.out.println (str.length());
		}
	        catch(NullPointerException e){
			throw new NullPointerException("NullPointerException....");
		}
	   
		
		return "test";
	}

}
