package Code_Of_Java.Array_Programs;


import java.util.*;

public class DoubleArrayContent {
    
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] ans = new int[2*n];
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
        ans = addDoubleArray(n,nums);
       System.out.println(Arrays.toString(ans));
       sc.close();
	}
     public static int[] addDoubleArray(int n, int[] nums) {
    	 n = nums.length;
         int[] ans = new int[2*n];
         for(int i =0; i<n; i++){
             ans[i] = nums[i];
             ans[n+i] = nums[i];
         }
         return(ans);
     
     }
    	 
     }
