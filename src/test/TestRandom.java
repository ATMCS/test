package test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestRandom {

	public static void main(String[] args) {
	      ArrayList<Integer> list = new ArrayList<>();
	      list.add(1);
	      list.add(2);
	      Iterator<Integer> it = list.iterator();
	      if (it.hasNext()) {
	    	  System.out.println(it.next());
	    	  System.out.println(it.next());  
	      }
	      
	      long temp = (int)3.9;
	      System.out.println(temp%=2);
	      
	      
		}

}
