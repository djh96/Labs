import java.util.Random;
import java.util.Scanner; 

public class OfficeQuest
{
	private static Stapler stapler = new Stapler();
	private static TapeDispenser tapeDispenser = new TapeDispenser();
	private static Random rand = new Random();
	private static Scanner keyboard = new Scanner(System.in);
	private static int staples = 0;
	private static double tape = 0.0;
	private static int turn = 0;
	private static int paper = 0;
	private static String input = "";
	private static boolean test = false;
	private static int hours = 8, minutes = 0;
	
	public static void main(String[] args)
	{
		staples = stapler.Stapler();
		tape = tapeDispenser.TapeDispenser();
		runProgram();
	}
	public static void runProgram()
	{
		if(turn == 24)
		{
			System.out.println("Congratulations, the day is done.  You survived your OFFICE QUEST.");
			System.exit(0);
		}
		System.out.println("Turn number: " + turn);
		if(turn == 0)
		{
			staples = stapler.Stapler();
			tape = tapeDispenser.TapeDispenser();
		}
		stapler.stapleUpdate();
		tapeDispenser.tapeUpdate();
		int randNum = rand.nextInt(20);
		if(randNum >= 0 && randNum <= 17)
		{
			paper = collate();
		}
		else if(randNum == 18)
		{
			System.out.println("The delivery person came by with more staples!");
			staples = stapler.addStaples(staples);
			displayTime();
			turn++;
			runProgram();
		}
		else if(randNum == 19)
		{
			System.out.println("The delivery person came by with more tape!");
			tape = tapeDispenser.TapeDispenser();
			displayTime();
			turn++;
			runProgram();
		}
		getUserInput();
		if(input.charAt(0) == 'T' || input.charAt(0) == 't')
		{
			test = tapeDispenser.tape(paper);
		}
		if(input.charAt(0) == 'S' || input.charAt(0) == 's')
		{
			test = stapler.staple(paper);
		}
		if(test)
		{
			System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
			System.exit(0);
		}
		displayTime();
		turn++;
		runProgram();
	}
	public static void displayTime()
	{
		if((turn % 3) == 0)
		{
			hours -= 1;
			minutes += 40;
		}
		else
		{
			minutes -= 20;
		}
		System.out.println(hours + " hour(s) and " + minutes + " minutes to go...");
	}
	public static int collate()
	{
		int randNum = rand.nextInt(60) + 1;
		System.out.println("The delivery person dropped off " + randNum + " pages to collate!");
		return randNum;
	}
	public static void getUserInput()
	{
		System.out.print("[T]ape or [S]taple > ");
		input = keyboard.nextLine();
		switch(input)
		{
			case "t":
				break;
			case "T":
				break;
			case "s":
				break;
			case "S":
				break;
			default:
				getUserInput();
		}
	} 
}