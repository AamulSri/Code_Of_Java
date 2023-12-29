package Code_Of_Java.Array_Programs;

import java.util.Scanner;

public class ArraySum {
  public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int res =0;
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i:arr) {
			res +=i;
		}
		System.out.println(res);

    sc.close();
	}
}
