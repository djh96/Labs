public class World
{
	public int[][][][][] world = new int[10][10][10][10][10];
	private int[] current = new int[5];
	public int[][][][][] World()
	{
		return world;
	}
	public int getCoordinate(int dimension)
	{
		int value = 0;
		switch(dimension)
		{
			case 1:
				value = current[0];
				break;
			case 2:
				value = current[1];
				break;
			case 3:
				value = current[2];
				break;
			case 4:
				value = current[3];
				break;
			case 5:
				value = current[4];
				break;
		}
		return value;
	}
	public int[] currentArray(int coordinate, int dimension)
	{
		switch(dimension)
		{
			case 1:
				current[0] = coordinate;
				break;
			case 2:
				current[1] = coordinate;
				break;
			case 3:
				current[2] = coordinate;
				break;
			case 4:
				current[3] = coordinate;
				break;
			case 5:
				current[4] = coordinate;
				break;
		}
		return current;
	}
	public void updateWorld()
	{
		world[current[0]][current[1]][current[2]][current[3]][current[4]] = -1;
	}
	public String getColor(int value)
	{
		String color = "";
		if(value == 1) 
		{
			color = "Lime";
		}
		if(value == 2) 
		{
			color = "Cerulean";
		}
		if(value == 3) 
		{
			color = "Goldenrod";	
		}
		if(value == 0 || value> 3)
		{
			color = "Black";
		}
		return color;
	}
}