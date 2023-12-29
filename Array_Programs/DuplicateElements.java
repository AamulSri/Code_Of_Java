package Code_Of_Java.Array_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElements {
  public static void main(String[] args) {
		int c =0;
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = a.nextInt();
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(n);
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], ((int)map.get(arr[i]))+1);
				if(1 == (int)map.get(arr[i])) {
					c++;
				}
			} else {
				map.put(arr[i], 0);
			}
		}
	  System.out.println(c);	
	  a.close();
	}
}
