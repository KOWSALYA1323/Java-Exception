package javaprogram2;

import java.util.ArrayList;

public class ListtoArray {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("Kowsalya");
	    arrayList.add("14906");
	    arrayList.add("JAT");
	    arrayList.add("Testing");
	    arrayList.add("Guvi");
	    System.out.println(arrayList);
	    
	    Object[] objArray = arrayList.toArray();
	    
	    for(int index=0; index < objArray.length ; index++)
	        System.out.println(objArray[index]);
	}

}
