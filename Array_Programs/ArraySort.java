package Code_Of_Java.Array_Programs;


import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 int len = sc.nextInt();
 int[] arr = new int[len];
 for(int i=0;i<len;i++) {
	 arr[i]=(sc.nextInt());
 }
 Arrays.sort(arr);
 System.out.println(Arrays.toString(arr));
 sc.close();
}
}
