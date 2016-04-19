import java.util.*;
class Troll extends Monster
{
	public static int _defeats = 0;

    public Troll() 
    {
		_hp = 30;
    }
   
    public String getName()
    {
		return "Troll";
    }

    // Calculate damage from a regular attack
    
    public int attack() 
    {
    	int hit = _rng.nextInt(10) + 1;
		
		System.out.println(hit + " points.");

		if (_hp <= 0) 
		{
		    _defeats++;
		}
		return hit;
    }

    public int berserk()
    {
       	int hit = _rng.nextInt(10) + 1;

		System.out.println(hit*2 + " points.");

		if (_hp <= 0) 
		{
		    _defeats++;
		}
		return hit * 2;
    }
    public int getDefeated()
    {
    	return _defeats;
    }
}