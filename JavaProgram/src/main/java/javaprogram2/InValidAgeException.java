package javaprogram2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InValidAgeException {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			vote(age);
		} catch (Exception e) {
			
			System.out.println("Age must be 18");
		}



	}
	public static void vote(int age) throws FileNotFoundException
	{
		if(age < 18)
		{
			System.out.println("You are not eligible to vote");
		}
		
		else
		{
			System.out.println("You are eligible to vote");
		}
	}

}
