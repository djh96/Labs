import java.util.Scanner;	
import java.io.*;

public class Lab7
{

	private static Scanner keyboard = new Scanner(System.in);	

	public static void main(String[] args) throws IOException
	{
		System.out.print("How big of a world? > ");	
		int input = keyboard.nextInt();
		char[] universe = generateUniverse(input);

		for(int i = 0; i < input; i++)
		{
			if(i % 7 == 0)
			{
				universe[i]	= '0';	
			}	
			else if(i % 5 == 0)
			{
				universe[i] = '^';
			}
			else
			{
				universe[i] = '.';
			}	
		}
		for(int i = 0; i < input; i++)
		{
			System.out.print(universe[i]);
		}
		getNext(universe);
	}

	public static char[] generateUniverse(int size)
	{
		char[] universe = new char[size];
		return universe;
	}

	public static void getNext(char[] universe) throws IOException
	{
		System.out.print("\n");
		String input = keyboard.next();
		
		if(input.equalsIgnoreCase("a"))
		{
			universe = advance(universe);
			getNext(universe);
		}
		else if(input.equalsIgnoreCase("q"))
		{
			quit();
		}
		else if(input.equalsIgnoreCase("s"))
		{
			saveToFile(universe);
			for(int i = 0; i < universe.length; i++)
			{
				System.out.print(universe[i]);
			}
			getNext(universe);
		}
	}

	public static char[] advance(char[] universe)
	{
		char[] universe2 = new char[universe.length];
		for(int i = 0; i < universe.length; i++)
		{
			universe2[i] = universe[i];
		}
		for(int i = 0; i < universe.length; i++)
		{
			if(universe2[i] == '0')
			{
				universe[i] = '1';
			}
			else if(universe2[i] == '1')
			{
				universe[i] = '2';
			}
			if((universe2[i] == '2') && (i != ((universe.length) - 1)) && universe2[i+1] != '2')
			{
				universe[(i+1)] = '2';
				universe[i] = '.';
			}
			if((i != ((universe.length) - 1)))
			{
				if(universe2[i+1] == '^' && universe2[i] == '2')
				{
					universe[(i+1)] = '0';	
					universe[i] = '.';
				}
			}
		}
		for(int i = 0; i < universe.length; i++)
		{
			System.out.print(universe[i]);
		}
		return universe;
	}

	public static void saveToFile(char[] universe) throws IOException
	{
		int babies = 0, children = 0, adults = 0;
		PrintWriter writer = new PrintWriter("Universe.txt");

		for(int i = 0; i < universe.length; i++)
		{
			if(universe[i] == '0')
			{
				babies++;
			}
			else if(universe[i] == '1')
			{
				children++;
			}
			else if(universe[i] == '2')
			{
				adults++;
			}
		}
		for(int i = 0; i < universe.length; i++)
		{
			writer.print(universe[i]);
		}

		writer.println("");
		writer.println("Babies: " + babies);
		writer.println("Children: " + children);
		writer.println("Adults: " + adults);

		writer.close();	
	}

	public static void quit()
	{
		System.exit(0);
	}
}