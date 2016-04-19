import java.util.Random;
import java.util.Scanner;
public class Lab11
{
	public static Player dan = new Player();
	public static Random rand = new Random();
	public static Scanner keyboard = new Scanner(System.in);	

	public static void main(String[] args) 
	{
		runProgram();
	}
	public static void runProgram()
	{
		Monster drag = new Dragon();
		Monster gob = new Goblin();
		Monster troll = new Troll();
		Hoard hoard = new Hoard();

		int gold = 0;
		int randNum = rand.nextInt(11);
		System.out.print("You have encountered a ");

		if(randNum < 5) 
		{
			System.out.println(gob.getName());
		}
		else if(randNum < 9 && randNum > 4) 
		{
			System.out.println(troll.getName()); 
		}
		else if(randNum > 8)
		{
			System.out.println(drag.getName());
		}

		while(gob.getHitPoints() > 0 && troll.getHitPoints() > 0 && drag.getHitPoints() > 0)
		{	
			System.out.println("HP: " + dan.getHitPoints() + " MP: " + dan.getMagicPoints());
				
			if(randNum < 5) 
			{
				System.out.println("Monster HP: " + gob.getHitPoints());
			}
			else if(randNum < 9 && randNum > 4) 
			{
				System.out.println("Monster HP: " + troll.getHitPoints());
			}
			else if(randNum > 8)
			{
				System.out.println("Monster HP: " + drag.getHitPoints());
			}

			System.out.println("(A)ttack");			
			System.out.println("(B)erserk");			
			System.out.println("(M)agic");			
			System.out.println("(R)un Away");
			System.out.print("Your choice > ");
			String input = keyboard.nextLine();
			char letter = input.charAt(0);

			if(randNum < 5) 
			{
				switch(letter)
				{
					case 'A':
						gob.setHitPoints(dan.attack());
						dan.setHitPoints(gob.attack());
						break;
					case 'B':
						gob.setHitPoints(dan.berserk());
						dan.setHitPoints(gob.berserk());
						break;
					case 'M':
						System.out.print("You take ");
						dan.setMagicPoints();
						dan.setHitPoints(drag.attack());
						System.out.println("You feel revitalized");
						break;
					case 'R':
						System.out.print("You take ");
						dan.setHitPoints(gob.attack());
						System.out.println("You safely ran away.");
						runProgram();
						break;
				}
			}
			else if(randNum < 9 && randNum > 4) 
			{
				switch(letter)
				{
					case 'A':
						troll.setHitPoints(dan.attack());
						dan.setHitPoints(troll.attack());
						break;
					case 'B':
						troll.setHitPoints(dan.berserk());
						dan.setHitPoints(troll.berserk());
						break;
					case 'M':
						System.out.print("You take ");
						dan.setMagicPoints();
						dan.setHitPoints(drag.attack());
						System.out.println("You feel revitalized");
						break;
					case 'R':
						System.out.print("You take ");
						dan.setHitPoints(troll.attack());
						System.out.println("You safely ran away.");
						runProgram();
						break;
				}
			}
			else if(randNum > 8)
			{
				switch(letter)
				{
					case 'A':
						drag.setHitPoints(dan.attack());
						dan.setHitPoints(drag.attack());
						break;
					case 'B':
						drag.setHitPoints(dan.berserk());
						dan.setHitPoints(drag.berserk());
						break;
					case 'M':
						System.out.print("You take ");
						dan.setMagicPoints();
						dan.setHitPoints(drag.attack());
						System.out.println("You feel revitalized");
						break;
					case 'R':
						System.out.print("You take ");
						dan.setHitPoints(drag.attack());
						System.out.println("You safely ran away.");
						runProgram();
						break;
				}
			}
			if(dan.getHitPoints() < 1) 
			{
				if(randNum < 5) 
				{
					System.out.println("You have been vanquished by the " + gob.getName() + ".");
					System.exit(0);
				}
				else if(randNum < 9 && randNum > 4) 
				{
					System.out.println("You have been vanquished by the " + troll.getName() + ".");
					System.exit(0);
				}
				else if(randNum > 8)
				{
					System.out.println("You have been vanquished by the " + drag.getName() + ".");
					System.exit(0);
				}					
			}
		}
			if(randNum < 5) 
			{
				System.out.println("You have defeated the " + gob.getName() + "!");
				gold += hoard.getGold();
				dan.setGoldCollected(gold);
				System.out.println("You acquire " + gold + " gold.");
			}
			else if(randNum < 9 && randNum > 4) 
			{
				System.out.println("You have defeated the " + troll.getName() + "!");
				gold += hoard.getGold();
				dan.setGoldCollected(gold);
				System.out.println("You acquire " + gold + " gold.");
			}
			else if(randNum > 8)
			{
				System.out.println("You have defeated the " + drag.getName() + "!");

				System.out.println("You win!");
				gold += hoard.getGold();
				dan.setGoldCollected(gold);
				System.out.println("You acquire " + gold + " gold.");
				System.out.println("Number goblins defeated: " + gob.getDefeated());
				System.out.println("Number trolls defeated: " + troll.getDefeated());
				System.out.println("Number dragons defeated: " + drag.getDefeated());
				System.out.println("Gold pieces acquired: " + dan.getGoldCollected());
				System.exit(0);
			}		
		runProgram();
	}
}