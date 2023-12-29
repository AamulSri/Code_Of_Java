package Code_Of_Java.String_Programs;

import java.util.Scanner;

public class RemoveLeadingTrailingSpaces {
  public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		if(str!=null) {
			res = str.trim();
		}
        System.out.println(str + "_new string_" + res);
      sc.close();
	}
}
