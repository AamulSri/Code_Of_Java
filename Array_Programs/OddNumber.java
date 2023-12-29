package Code_Of_Java.Array_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumber {
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Boolean b = true;
	int len = sc.nextInt();
	List<Integer> l = new ArrayList<Integer>();
	for(int i=0;i<len;i++) {
		l.add(sc.nextInt());
	}
	for(int j: l) {
		if(j%2==0) {
			b = false;
		}
	}
	if(b) {
		System.out.println("List is odd");
	}
	else {
		System.out.println("List is even");
	}
  sc.close();
}
}
