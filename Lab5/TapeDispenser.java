public class TapeDispenser
{
	private static double tapeLeft = 0.0;

	public double TapeDispenser()
	{
		tapeLeft = 50;
		return tapeLeft;
	}
	public void tapeUpdate()
	{
		System.out.print("The tape dispenser looks... ");
		if(tapeLeft >= 45)
		{
			System.out.println("full.");
		}
		else if(tapeLeft < 45 && tapeLeft >= 35)
		{
			System.out.println("almost full.");
		}
		else if(tapeLeft < 35 && tapeLeft >= 15)
		{
			System.out.println("halfway full.");
		}
		else if(tapeLeft < 15 && tapeLeft > 0)
		{
			System.out.println("almost empty.");
		}
		else if(tapeLeft == 0)
		{
			System.out.println("empty.");
		}
	}
	public boolean tape(int paper)
	{

		tapeLeft -= (.25*paper);
		if(tapeLeft <= 0)
		{	
			System.out.println("You have run out of tape!");
			return true;
		}
		else
		{
			return false;
		}
	}
}