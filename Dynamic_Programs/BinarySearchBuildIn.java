package Code_Of_Java.Dynamic_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchBuildIn {
  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  int len = sc.nextInt();
		  int arr[] = new int[len];
		  for(int j=0; j<len;j++) {
			  arr[j]= sc.nextInt();
		  }
		  int key = sc.nextInt();
		  Arrays.sort(arr);
		  System.out.print(Arrays.toString(arr));
		  int res = binarySearch(arr,key);
		  System.out.println(res);
      sc.close();
	}

	private static int binarySearch(int[] arr, int key) {
		
		return( Arrays.binarySearch(arr,key));
	}

}
