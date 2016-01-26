public class Lab3
{
    
    public static void main(String[] args)
    {
    	double distance = 10;
    	int counter = 1;

    	while(distance != 0.0)
    	{
    		distance /= 2;
    		System.out.println("On step number " + counter + " Paris was " + distance
    			+ " meters away.");
    		counter++;
    	}

    }
}