package JavaBasicPackage;

public class FinalConcept {

	public static void main(String[] args) {
		
		FinalConcept f = new FinalConcept();
		System.out.println(f.add(5, 0));

		try {
			f.finalize();
			throw  new NumberFormatException(); 
		} catch (Throwable e) {
			System.out.println("Executing from finalize method"); 
		}
		
	}
	
	//@SuppressWarnings("finally")
	public int add(int a, int b) {
		int c=0;
		try {
		 c= a/b;
		}
		catch(Exception e)
		{
			System.out.println("Executing from catch block"); 
		}
		finally {
		System.out.println("Executing from finally block in add method"); 
		return c;
		}
	}

}
