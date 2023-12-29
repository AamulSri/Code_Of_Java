package Code_Of_Java.Array_Programs;

import java.util.ArrayList;

public class ForEachArray {
  public static void main(String[] args) {
	    ArrayList<Integer> arr =new ArrayList<Integer>(); 
	    arr.add(1);
	    arr.add(2);
	    arr.add(3);
	    arr.add(4);
	    arr.add(1);
        arr.forEach(System.out::print);
	}

}
