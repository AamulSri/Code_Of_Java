package Code_Of_Java.String_Programs;

import java.util.Scanner;

public class ReplaceString {
  public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String output = str.replace(" ", "");
       System.out.println(output);
       sc.close();
       
	}
}
