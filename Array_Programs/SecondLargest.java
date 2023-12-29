package Code_Of_Java.Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		for(int i =0; i<len;i++) {
			a[i]= sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Second Largest Element"+a[len-2]);
    sc.close();

	}
}
