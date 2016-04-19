import java.io.*;
import java.util.*;
public class Lab12
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("enter an int: ");
			Scanner keyboard = new Scanner(System.in);
			int integer = keyboard.nextInt();
		}
		catch(InputMismatchException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			int[] array = new int[5];

			for(int i = 0; i < 6; i++) 
			{

				array[i] = 10;
			}
		}	
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			int[] array = new int[-1];
		}
		catch(NegativeArraySizeException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			int x = 1/0;
		}	
		catch(ArithmeticException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			String string = "String";
			char character = string.charAt(100);
		}	
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			FileInputStream file = new FileInputStream("no_file.txt");
		}	
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			Object x = new Integer(0);
     		System.out.println((String)x);
		}	
		catch(ClassCastException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			File file = new File("no_file.txt");
			Scanner sc = new Scanner(file);
		}	
		catch(IOException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			int i = 0;
			throw (new NoogieException());
		}	
		catch(NoogieException ex)
		{
			System.out.println(ex.toString());
		}
		try
		{
			int i = 10;
			throw (new CoogieException(i));
		}	
		catch(CoogieException ex)
		{
			System.out.println(ex.toString());
		}
	}
}
class NoogieException extends Exception
{

}
class CoogieException extends Exception
{
	private int numCats;
	public CoogieException(int i)
	{
		numCats = i;
	}

	public String toString()
	{
		String s = "CoogieException: " + numCats + " is too many cats!";
		return s;
	}
}
