
public class ThrowsMain {

	public static void main(String[] args) {
	 ThrowsCheck classtwo= new ThrowsCheck();
	 try{
	 System.out.println(classtwo.testThrows());
	 }catch(Exception error){
		 if(error instanceof NullPointerException){
			 System.out.println(error.getMessage());
		 }
	 }
	}
}
