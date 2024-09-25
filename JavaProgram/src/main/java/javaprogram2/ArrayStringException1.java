package javaprogram2;

public class ArrayStringException1 {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a[]	= {10,20,30,40,50,60,70,80,90,20};
			System.out.println(a[11]);
			
		}
		catch (ArrayIndexOutOfBoundsException aie)
		{
		System.out.println("Out of array limit");
		}
		
		try {
			String str="kowsalya";
			System.out.println(str.charAt(9));
			
		}
		catch (StringIndexOutOfBoundsException se)
		{
		System.out.println("String out of bound");
		}
		
		
		finally {
			System.out.println("Finally block execute");
		}
		System.out.println("Finish");
	}

}
