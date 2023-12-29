package Code_Of_Java.String_Programs;

import java.util.Scanner;

public class Pallidrome {
  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
        if(str.equalsIgnoreCase(sb.toString())) {
        	System.out.println("Pallidrome String");
        }
        else {
        	System.out.println("Not a Pallidrome String");
        }
        sc.close();
	}
}
