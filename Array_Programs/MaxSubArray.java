package Code_Of_Java.Array_Programs;

import java.util.Scanner;

public class MaxSubArray {
  public static void main(String[] args) {
		int res;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		int[][] acc = new int[m][n];
		
	    for(int i=0;i<m;i++) {
	    	for(int j=0;j<n;j++) {
	    		acc[i][j]=sc.nextInt();
	    	}
	    }
	    res = maximumWealth(acc);
	    System.out.println(res);
      sc.close();
	    
	}
	 public static int maximumWealth(int[][] accounts) {
		 int res = 0;
	        for(int i =0;i<accounts.length;i++){
	            int c=0;
	            for(int j=0;j<accounts[i].length;j++){
	                c+=accounts[i][j];
	            }
	            res= Math.max(res,c);
	        }
	        return(res);
	    }
}
