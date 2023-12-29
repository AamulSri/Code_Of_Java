package Code_Of_Java.Array_Programs;


import java.util.*;
public class Fibonacci {
public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	Integer n = sc.nextInt();
	for(Integer j=0;j<n;j++) {
		System.out.print(fib(j)+" ");
	}
  sc.close();
}

public static Integer fib(Integer a) {
	if(a<=1) 
		{return a;}
	return fib(a-1)+ fib(a-2);
}
}
