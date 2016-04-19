import java.util.*;
public class Dragon extends Monster
{
	public static int _defeats = 0;

    public Dragon() 
    {
		_hp = 100;
    }
   
    public String getName()
    {
		return "Dragon";
    }

    // Calculate damage from a regular attack
    
    public int attack() 
    {
    	int hit = _rng.nextInt(20) + 1;
		
		System.out.println(hit + " points.");

		if (_hp <= 0) 
		{
		    _defeats++;
		}
		return hit;
    }

    public int berserk()
    {
       	int hit = _rng.nextInt(20) + 1;

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