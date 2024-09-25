package javaprogram2;

import java.util.Scanner;

public class ArithameticException1 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
			
		}
		catch (ArithmeticException ae)
		{
		System.out.println("Not divided by zero");
		}
		finally {
			System.out.println("Finally block execute");
		}
		System.out.println("Finish");

	}

}
