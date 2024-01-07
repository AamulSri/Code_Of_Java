package Code_Of_Java.Java_Properties;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
		   int x = 5 / 0;
	} catch (ArithmeticException e) {
			System.out.println("Catch Block");
			  System.exit(0);

		} finally {
			System.out.println("Finally Block Execuated");
		}
	}
}


