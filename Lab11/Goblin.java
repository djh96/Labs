import java.util.*;
class Goblin extends Monster
{
	public static int _defeats = 0;

    public Goblin() 
    {
		_hp = 10;
    }
   
    public String getName()
    {
		return "Goblin";
    }

    // Calculate damage from a regular attack
    
    public int attack() 
    {
    	int hit = _rng.nextInt(5) + 1;
		
		System.out.println(hit + " points.");

		if (_hp <= 0) 
		{
		    _defeats++;
		}
		return hit;
    }

    public int berserk()
    {
       	int hit = _rng.nextInt(5) + 1;

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
