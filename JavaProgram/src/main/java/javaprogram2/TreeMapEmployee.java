package javaprogram2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployee {

	public static void main(String[] args) {
		TreeMap <String, Integer> mymap=new TreeMap <String, Integer>();    
		mymap.put("Kowsalya", 101);   
		mymap.put("Sakthi", 102);    
		mymap.put("Meha", 103);    
		mymap.put("Mithra", 104);    
	        
	      System.out.println(mymap);
	      
	      for(Map.Entry<String, Integer> entry:mymap.entrySet())
	      {
	    	  System.out.println(entry.getKey()+":"+entry.getValue());
	      }
	}

}
