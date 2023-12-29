package Code_Of_Java.Array_Programs;

import java.util.*;
public class SumOfElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Length");
		int len = sc.nextInt();
		int s=0;
		int a[] = new int[len];
		for(int i=0;i<len;i++) {
			a[i] = sc.nextInt();
			s += a[i];
		}
        System.out.println(s);
        sc.close();
	}

}