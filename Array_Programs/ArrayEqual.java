package Code_Of_Java.Array_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayEqual {
  public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       Integer a[] = {1,2,3,3,2};
       Integer b[] = {1,2,3,3,4};
       Boolean bol=true;
       Set<Object> sa = new HashSet<>(Arrays.asList(a));
       Set<Object> sb = new HashSet<>(Arrays.asList(b));
       if(sa.size()!=sb.size()) {
    	   bol = false;
       }
       for(Object i : sa) {
    	   if(!sb.contains(i)) {
    		   bol = false;
    	   }
       }
       if(bol) 
    	   System.out.println("Same Arrays");
       else {System.out.println("Diff Arrays");
	}
  sc.close();
	}
}
