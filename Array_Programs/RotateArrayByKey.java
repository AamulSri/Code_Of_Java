package Code_Of_Java.Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKey {
  public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      int[] res = new int[n];
      int pos =0;
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      int key = sc.nextInt();
      for(int i=0;i<n;i++) {
    	  if(n>i+key) {
    		  pos = i+key;
    		 
    	  }
    	  else {
    		  pos = (i+key)-n;
    	  }
    	  res[pos]= arr[i];
      }
      System.out.println(Arrays.toString(res));
      sc.close();
      }
      
}
