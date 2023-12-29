package Code_Of_Java.Array_Programs;

import java.util.Scanner;

public class GoodPair {
  public static void main(String[] args) {
		int n ,res, inp[] = new int[101];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			inp[i]=sc.nextInt();
		}
		res = findGoodPair(n,inp);
		System.out.println(res);
    sc.close();
	}
    public static int findGoodPair(int n , int[] ans) {
    	int c=0, cnt[] = new int[n];
    	for(int a:ans) {
    	c+=cnt[a]++;
    	 }
    	return(c);
    }
}
