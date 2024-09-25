package javaprogram2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotfoundException {

	public static void main(String[] args) {
		try
		{
			read();
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}
	public static void read() throws FileNotFoundException
	{
		FileReader fr = new FileReader("data.txt");
	}
}

