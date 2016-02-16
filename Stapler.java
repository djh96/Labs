public class Stapler
{
	private static int staplesLeft = 0;

	public int Stapler()
	{
		staplesLeft = 10;
		return staplesLeft;
	}
	public int addStaples(int s)
	{
		s = 10;
		staplesLeft += s;
		return staplesLeft;
	}
	public void stapleUpdate()
	{
		System.out.print("The stapler feels... ");
		if(staplesLeft > 10)
		{
			System.out.println("really heavy.");
		}
		else if(staplesLeft > 5 && staplesLeft <= 10)
		{
			System.out.println("heavy.");
		}
		else if(staplesLeft > 0 && staplesLeft <= 5)
		{
			System.out.println("light.");
		}
		else if(staplesLeft == 0)
		{
			System.out.println("really light.");
		}
	}
	public boolean staple(int paper)
	{
		if(paper <= 50)
		{
			staplesLeft -= 1;	
		}
		else if(paper > 50)
		{
			System.out.println("Stapler jammed!");
			staplesLeft -= 3;	
		}
		System.out.println(staplesLeft);
		if(staplesLeft <= 0)
		{	
			System.out.println("You have run out of staples!");
			return true;
		}
		else
		{
			return false;
		}
	}
}