package Code_Of_Java.Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SuffleArray {
  public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[2*n];
        int res[] = new int[2*n];
        for(int i=0;i<2*n;i++) {
        	nums[i] = sc.nextInt();
        }
		res = shuffle(nums, n);
		System.out.println(Arrays.toString(res));
    sc.close();
	}
	public static int[] shuffle(int[] nums, int n) {
	       int res[] = new int[2*n];
	       int c=0;
	       for(int i=0;i<2*n;i++){
	           while(c<2*n){
	           res[c++]=nums[i];
	           res[c++] = nums[i+n];
	           break;
	       }
	       }
	        return(res);
	    }
}
