import java.util.Random;

public class Lab8
{
	private static Random rand = new Random();
	private static int numOfRuts = 0;
	private static int panSize = 5, marSize = 5;
	private static int season = 1, panResize = 0, marResize = 0;

	public static void main(String[] args)
	{
		int[] pangloss = {0, 0, 0, 0, 0};
		int[] martin = {0, 0, 0, 0, 0};
		newRuts(pangloss, martin);
	}
	public static void newRuts(int[] pangloss, int[] martin)
	{

		int randNum = 0;
		if(season == 41)
		{
			printArray(martin);		
			System.out.println("Martin Garden Size : " + marSize + ", Resized " + marResize + " times.");
			printArray(pangloss);
			System.out.println("Pangloss Garden Size : " + panSize + ", Resized " + panResize + " times.");
			System.exit(0);
		}
		while(season <= 40)
		{
			randNum = rand.nextInt(5);
			if(randNum == 0) 
			{
				System.out.println("Season: " + season + ", " + randNum + " rutabaga(s)");
				season++;
				newRuts(pangloss, martin);
			}
			System.out.println("Season: " + season + ", " + randNum + " rutabaga(s)");
			checkSize(randNum, pangloss, martin);
		}
	}
	public static void checkSize(int ruts, int[] pangloss, int[] martin)
	{
		numOfRuts += ruts;
		int[] pangloss2 = new int[(panSize*2)];
		int[] martin2 = new int[(marSize+2)];
		if((numOfRuts > panSize) || (numOfRuts > marSize))
		{
			if(numOfRuts > panSize) 
			{
				pangloss2 = doubleArray(pangloss, panSize);
			}	
			else if(numOfRuts <= panSize) 
			{
				pangloss2 = copyArray(pangloss);
			}		
			if(numOfRuts <= panSize)
			{
				martin2 = copyArray(martin);
			}
			while(numOfRuts > marSize)
			{
				martin2 = addTwoArray(martin, marSize);
			}
			fillGarden(pangloss2, martin2, ruts);
		}
		else if(numOfRuts <= panSize && numOfRuts <= marSize) 
		{
			pangloss2 = copyArray(pangloss);
			martin2 = copyArray(martin);
			fillGarden(pangloss2, martin2, ruts);
		}
	}
	public static int[] copyArray(int[] arr)
	{
		int[] arr2 = new int[(arr.length)];
		for(int i = 0; i < arr.length; i++) 
		{
			arr2[i] = arr[i];
		}
		return arr2;
	}
	public static int[] doubleArray(int[] pangloss, int size)
	{
		size = pangloss.length * 2;
		int[] pangloss2 = new int[size];
		for(int i = 0; i < pangloss.length; i++)
		{
			pangloss2[i] = pangloss[i];
		}

		System.out.println("Resized Pangloss's Garden to " + size);
		panSize = size;
		panResize++;
		return pangloss2;
	}
	public static int[] addTwoArray(int[] martin, int size)
	{
		size += 2;
		int[] martin2 = new int[size];
		for(int i = 0; i < martin.length; i++)
		{
			martin2[i] = martin[i];
		}
		System.out.println("Resized Martin's Garden to " + size);
		marSize = size;
		marResize++;
		return martin2;
	}
	public static void fillGarden(int[] pangloss2, int[] martin2, int ruts)
	{
		int i = 0, counter = 0;
		while(counter < ruts)
		{
			if(pangloss2[i] == 0)
			{
				pangloss2[i] = ruts;
				martin2[i] = ruts;
				counter++;
			}
			i++;
		}
		season++;
		newRuts(pangloss2, martin2);
	}
    public static void printArray(int[] arr)
    {
	    System.out.print("[ ");
	    for (int j=0; j < (arr.length); j++) 
	    {
	        if (arr[j] == 0)
	        {
	        	System.out.print("***");
	        }
	        else 
	        {
	        	System.out.print(arr[j]);
	        }
	        if(!(j == (arr.length-1)))
	        {
	        	System.out.print(", ");
	        }
	    }
	    System.out.println(" ]");
	}
}