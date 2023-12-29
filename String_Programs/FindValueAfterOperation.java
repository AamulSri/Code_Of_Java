package Code_Of_Java.String_Programs;

import java.util.Scanner;

public class FindValueAfterOperation {
  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String operations[] = new String[n];
		for(int i =0;i<n;i++) {
			operations[i]= sc.next();
		}
		int res = finalValueAfterOperations(operations);
		System.out.println(res);
    sc.close();

	}
	 public static int finalValueAfterOperations(String[] operations) {
	        int x=0, n = operations.length;
	        for(int i =0;i<n;i++){
	            if(operations[i].equalsIgnoreCase("X++"))
	                 x++;
	            else if(operations[i].equalsIgnoreCase("X--"))
	                 x--;
	            else if(operations[i].equalsIgnoreCase("++X"))
	                 ++x;
	            else if(operations[i].equalsIgnoreCase("--X"))
	                 --x;    
	                
	            }
	            return(x);
	        }
}
