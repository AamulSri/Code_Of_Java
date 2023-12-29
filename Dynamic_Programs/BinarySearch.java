package Code_Of_Java.Dynamic_Programs;

import java.util.*;

public class BinarySearch {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  int len = sc.nextInt();
	  int l=0;
	  int arr[] = new int[len];
	  for(int j=0; j<len;j++) {
		  arr[j]= sc.nextInt();
	  }
	  int key = sc.nextInt();
	  Arrays.sort(arr);
	  System.out.print(Arrays.toString(arr));
	  int res = binarySearch(arr,key,len,l);
	  System.out.println(res);
    sc.close();
  }
  public static int binarySearch(int a[], int key, int h,int l) {
	 int i = (l+(h-1))/2;
	 while(l<h) {
	 if(key == a[i]) {
		 return i;
	 }
	 else if(key<a[i]) {
		 return binarySearch(a,key,i-1,l);
	 }
	 else  {
		 return binarySearch(a,key,h,i+1);
	 }
	  
  }
   return -1;
    
}
}