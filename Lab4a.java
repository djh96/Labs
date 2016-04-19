import java.util.Scanner;
public class Lab4a
{
	private static Scanner keyboard = new Scanner(System.in);
	private static int util = 0;
	private static int people = 0;
	private static int input = 0;;
	private static String name = "";
	public static void main(String[] args)
	{
		name();
		options();
	}
	public static void name()
	{
		System.out.println("Enter your name");
		name = keyboard.nextLine();
	}	
	public static void options()
	{
		System.out.println("(1) - Buy people ice cream");
		System.out.println("(2) - Steal ice cream from people");
		System.out.println("(3) - Dream about people eating ice cream");
		System.out.println("(4) - Die");
		System.out.println("Enter next action of " + name);
		input = keyboard.nextInt();

		switch(input)
		{
			case 1:
				System.out.println("How many people?");
				people = keyboard.nextInt();
				System.out.println("This action caused " + (people*3) + " utils of happiness.");
				util += people*3;
				options();
				break;
			case 2:
				System.out.println("How many people?");
				people = keyboard.nextInt();	
				System.out.println("This action caused " + (people*-5) + " utils of happiness.");
				util += people*-5;
				options();
				break;	
			case 3:	
				System.out.println("How many people?");
				people = keyboard.nextInt();	
				System.out.println("This action caused " + (people*0) + " utils of happiness.");
				util += people*0;
				options();
				break;	
			case 4:
				finish();
				break;
		}
	}
	public static void finish()
	{
		System.out.println(name + " caused " + util + " utils of happiness.");

		if(util < 0)
		{
			System.out.println("This was a morally evil life");
		}		
		else if(util == 0)
		{
			System.out.println("This was a morally neutral life.");	
		}
		else if(util > 0)
		{
			System.out.println("This was a morally good life");	
		}
	}
}