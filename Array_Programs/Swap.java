package Code_Of_Java.Array_Programs;

import java.util.Scanner;

public class Swap {
  public static void main(String args[]) {
	Scanner sb = new Scanner(System.in);
	Integer a = sb.nextInt();
	Integer b = sb.nextInt();
  sb.close();
	try {
	if(a == null || b == null) {
		throw new NullPointerException();
	}
		else {
			a=a+b;
			b= a-b;
			a= a-b;
			System.out.println(a+" "+ b);
		}
	}catch(NullPointerException e) {
		System.out.println(e);
	}

}
}
