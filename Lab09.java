import java.util.Scanner; //Imports the scanner class
public class Lab09
{
	private static Scanner keyboard = new Scanner(System.in);
	public static World world = new World();
	public static Scientist scientist = new Scientist(world);

	public static void main(String[] args) 
	{
		travel();	
	}
	public static void travel()
	{
		System.out.print("Enter dimension to travel (1,2,3,4,5) (negative to quit) > ");
		int input = keyboard.nextInt();
		if(input < 0)
		{
			System.exit(0);
		}
		System.out.print("Enter units to travel (negative for backwards) ");
		int input2 = keyboard.nextInt();

		int array[] = scientist.move(input, input2);
		if(world.world[array[0]][array[1]][array[2]][array[3]][array[4]] == -1) 
		{
			printArray(array, 1);
		}
		else
		{
			printArray(array, 0);
		}

		world.updateWorld();
		travel();
	}
	public static void printArray(int[] array, int white)
	{
		System.out.print("Location: [");
		for(int i = 0; i < 5; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.print("] = ");

		if(white == 1) 
		{
			System.out.println("White");
		}
		else
		{
			int value = 0;
			for(int i = 0; i < 5; i++) 
			{
				value += array[i];
			}
			String color = world.getColor(value);
			System.out.println(color);
		}
	}
}