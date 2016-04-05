import java.util.*;
public class Hoard
{
	private static int gold;
	Random _rng = new Random();
	public Hoard()
	{
		gold = _rng.nextInt(100) + 1;
	}
	public int getGold()
	{
		return gold;
	}
}