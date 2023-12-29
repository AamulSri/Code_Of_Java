package Code_Of_Java.String_Programs;

import java.util.Scanner;

public class Vowels {
  public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str==null) {
			System.out.println("Null String isn't accepted");
		}
		else {
			Boolean b= str.toLowerCase().matches("(.*)[aeiou](.*)");
			if(b==true) {
				System.out.println("Yes vowels are present");
			}
			else {
				System.out.println("No vowels are there");
			}
		}
    sc.close();
	}
}
