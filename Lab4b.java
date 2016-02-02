import java.util.Scanner;
public class Lab4b
{
	public static void main(String[] args)
	{
		System.out.println("5. Self-actualization (achieving your total potential)");
		System.out.println("4. Esteem (e.g., respect from others, self-respect)");
		System.out.println("3. Love and Belonging (e.g., friendship and family)");
		System.out.println("2. Safety (e.g., personal and financial security)");
		System.out.println("1. Physiological (e.g., oxygen, food, water)");
		System.out.print("Level>");
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		switch(input)
		{
			case 5:
				System.out.println("5. Self-actualization (achieving your total potential)");
			case 4:
				System.out.println("4. Esteem (e.g., respect from others, self-respect)");
			case 3:
				System.out.println("3. Love and Belonging (e.g., friendship and family)");
			case 2:
				System.out.println("2. Safety (e.g., personal and financial security)");
			case 1:
				System.out.println("1. Physiological (e.g., oxygen, food, water)");
		}
	}
}