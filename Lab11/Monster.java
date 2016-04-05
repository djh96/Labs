import java.util.*;

public class Monster 
{
    public int _hp = 0;
    
    public Random _rng = new Random();
  	public static int _defeats = 0;

    public Hoard _hoard = new Hoard();
    
    public String getName() {
	return "Monster";
    }
    
    public int attack() {
	//_hp -= hit;

	return 0;
    }
    
    public int berserk() {
	//_hp -= (hit * 3);
	return 0 * 2;
 
    }

	public void setHitPoints(int hit)
	{
		_hp -= hit;
	}
    public int getHitPoints()
    {
    	return _hp;
    }
    public int getDefeated()
    {
    	return _defeats;
    }
}
