package Code_Of_Java.Dynamic_Programs;

import java.util.LinkedList;

public class LinkedListOperations {
  public static void main(String[] args) {
      LinkedList<String> l = new LinkedList<String>();
      l.add("A");
      l.add("B");
      l.add("C");
      l.add("D");
      l.add("E");
      l.add("F");
      l.addFirst("Z");
      l.addLast("A");
      
      System.out.println(l);
      
      l.add(8,"X");
      System.out.println(l);
      
		
      for(int i=l.size()-1; i>=0;i--) {
    	  
    	  System.out.print(l.get(i)+" ");
      }
	
	
	LinkedList<String> revlist = new LinkedList<String>();
	l.descendingIterator().forEachRemaining(revlist::add);
	System.out.print(revlist);

}
}
