package Code_Of_Java.Java_Properties;

  public class Parent {
	public static void main(String args[]) {
		Child.add(2, 3);
		Child.add(1, 1, 1);
		Parent.add(4, 3, 3);
		Parent.add(10, 10, 10);
	}
		 public static int add(int a, int b, int c) {
			   System.out.println("Parent Class");
			   return(a+b+c);
		   }
	}
	class Child extends Parent {

	   public static int add(int a, int b) {
		   System.out.println("Child Class with 2 some");
		   return(a+b);
	   }

	   public static int add(int a, int b, int c) {
		   System.out.println("Child Class overrides Parent Class method");
		   return(a+b+c);
	   }
	}
	

