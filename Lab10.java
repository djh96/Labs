import java.util.*;
public class Lab10
{
/**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	    
    }

    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static boolean swap(int[] arr, int index1, int index2) {
	boolean test = true;
	if (index1 == index2) {
	    // Do nothing!
	    test = true;
	} else {
	    int tmp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = tmp;
	    test = false;
	}
	return test;
    }

    /**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
    
    public static int selectionSort(int[] arr) {
	
	int swaps = 0;
	boolean test = true;
	int minIndex = 0;
	int minVal = 0;

	for (int j = 0; j < (arr.length-1); j++) {

	    //printArray(arr);
	    minIndex = j;
	    minVal = arr[j];
	    for(int k = j + 1; k < arr.length; k++) {

		if (arr[k] < minVal) {

		    minVal = arr[k];
		    minIndex = k;
		}
	    }
	    test = swap(arr, j, minIndex);
	    if(test == false) 
	    {
	    	swaps++;
	    }
	}
	System.out.println("Selection Sort: ");
	printArray(arr);
	return swaps;
    }
	public static int[][] deepCopy(int[][] arr)
	{
		int[][] arr2 = new int[arr.length][];

		for(int i = 0; i < arr.length; i++) 
		{
			arr2[i] = new int[arr[i].length];
		}
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr[i].length; j++) 
			{
				arr2[i][j] = arr[i][j];
			}
		}		
		return arr2;
	}

	public static int bubbleSort(int[] arr)
	{
		int first = 0, second = 0, iteration = 0, swaps = 0;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			//System.out.println("Iteration " + i + ":");
			if(i == 0)
			{
				//printArray(arr);
			}

			for(int j = 0; j < arr.length - 1; j++)
			{	
				if(j == 0 && i!= 0)
				{
					//printArray(arr);
				}

				first = arr[j];
				second = arr[j+1];

				if(second < first) 
				{
					//System.out.println("Swapping position " + j + " (Value: " + arr[j] + ") and " + (j+1) + " (Value:  "+ arr[j+1] + ")");
					arr[j] = second;
					arr[j+1] = first;
					//printArray(arr);
					swaps++;
				}
			}
			//System.out.println();
		}	
		//System.out.println("Iteration " + (arr.length-1) + ":");
		System.out.println("Bubble Sort:");
		printArray(arr);
		return swaps;
	}

    public static void main(String[] args) 
    {
		int[][] a1 = { {8, 9, 5, 6, 4, 3},
			       {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
			       {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200 },
			       {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
			       {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000} };
		
		int[][] a2 = deepCopy(a1);

		int swaps = 0;
		for(int i = 0; i < a1.length; i++)
		{
			swaps = bubbleSort(a1[i]);
			System.out.println("Swaps = " + swaps);
			System.out.println();

			swaps = selectionSort(a2[i]);
			System.out.println("Swaps = " + swaps);
			System.out.println();

	    }	
	}
}