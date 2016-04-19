public class Scientist
{
	public static World world = new World();
	public static int first = 0, second = 0, third = 0, fourth = 0, fifth = 0;
	public Scientist(World w)
	{
		world = w;
	}
	public int[] move(int dimension, int numUnits)
	{
		int coordinate = 0;
		switch(dimension)
		{
			case 1:
				coordinate = world.getCoordinate(1);
				numUnits = numUnits%10;
				if(numUnits > 0)
				{
					if(coordinate + numUnits > 10) 
					{
						coordinate -= (10-numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				if(numUnits < 0)
				{
					if(coordinate + numUnits < 0) 
					{
						coordinate += (10+numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				break;
			case 2:
				coordinate = world.getCoordinate(2);
				numUnits = numUnits%10;
				if(numUnits > 0)
				{
					if(coordinate + numUnits > 10) 
					{
						coordinate -= (10-numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				if(numUnits < 0)
				{
					if(coordinate + numUnits < 0) 
					{
						coordinate += (10+numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				break;
			case 3:
				coordinate = world.getCoordinate(3);
				numUnits = numUnits%10;
				if(numUnits > 0)
				{
					if(coordinate + numUnits > 10) 
					{
						coordinate -= (10-numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				if(numUnits < 0)
				{
					if(coordinate + numUnits < 0) 
					{
						coordinate += (10+numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				break;
			case 4:
				coordinate = world.getCoordinate(4);
				numUnits = numUnits%10;
				if(numUnits > 0)
				{
					if(coordinate + numUnits > 10) 
					{
						coordinate -= (10-numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				if(numUnits < 0)
				{
					if(coordinate + numUnits < 0) 
					{
						coordinate += (10+numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				break;
			case 5:
				coordinate = world.getCoordinate(5);
				numUnits = numUnits%10;
				if(numUnits > 0)
				{
					if(coordinate + numUnits > 10) 
					{
						coordinate -= (10-numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				if(numUnits < 0)
				{
					if(coordinate + numUnits < 0) 
					{
						coordinate += (10+numUnits);
					}
					else
					{
						coordinate += numUnits;
					}
				}
				break;
		}
		int[] intArray = world.currentArray(coordinate, dimension);
		first = intArray[0];
		second = intArray[1];
		third = intArray[2];
		fourth = intArray[3];
		fifth = intArray[4];
		int returnArray[] = {first, second, third, fourth, fifth, coordinate};
		return returnArray;
	}
}