import java.util.Random;
public class Player
{
	private static int hitPoints;
	private static int magicPoints;
	private static int goldCollected;
	private static Random rand = new Random();

	public Player()
	{
		hitPoints = 100;
		magicPoints = 3;
		goldCollected = 0;
	}
	public void setHitPoints(int hit)
	{
		hitPoints -= hit;
	}

	public int getHitPoints()
	{
		return hitPoints;
	}

	public void setMagicPoints()
	{
		magicPoints--;
		hitPoints = 100;
	}
	public int getMagicPoints()
	{
		return magicPoints;
	}

	public void setGoldCollected(int gold)
	{
		goldCollected += gold;
	}

	public int getGoldCollected()
	{
		return goldCollected;
	}
    public int attack() 
    {
    	int hit = rand.nextInt(15) + 1;

		System.out.print("You dished out " + hit + " points, and you received ");
    	return hit;
    }

    public int berserk()
    {
       	int hit = rand.nextInt(15) + 1;
		System.out.print("You dished out " + hit*3 + " points, and you received ");
		return hit*3;
    }
}