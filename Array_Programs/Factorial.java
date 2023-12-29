package Code_Of_Java.Array_Programs;

import java.util.Scanner;

public class Factorial {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fac = sc.nextInt();
    int res = factorial(fac);
    System.out.println(res);
    sc.close();
	}
    public static int factorial(int fac) {
    	if(fac==1) {
    		return 1;
    	}
    	return fac*factorial(fac-1);
    }
}
