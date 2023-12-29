package Code_Of_Java.String_Programs;

import java.util.Scanner;

public class MaxString {
  public static void main(String[] args) {
	  int n,max;
	 
	  Scanner sc = new Scanner(System.in);
	  n=sc.nextInt();
	  String[] str = new String[n];
	  for(int i =0;i<n;i++) {
		  str[i] = sc.nextLine(); 
	  }
     max =mostWordsFound(str);
     System.out.println(max);
     sc.close();
	}
	  public static  int mostWordsFound(String[] sentences) {
	        int max=0;
	        
	        for(int i=0; i<sentences.length;i++){
	        	String[] s = sentences[i].split("\\s");
	            if(max<s.length){
	                max=s.length;
	            }
	        }
	        return max;
	    }
}
