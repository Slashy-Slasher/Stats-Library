import java.util.Random;

public class DoorChance 
{
	public static void main(String args[])
	{ 
		DoorChance sim = new DoorChance();
		sim.gameLoop();
		// System.out.print("Cringe");
	}
	public void gameLoop() 
	{
		int runCount = 0;
		int[] arr = {0,0,0};
		int[] case1 = {1, 0, 0};
		int[] case2 = {0, 1, 0};
		int[] case3 = {0, 0, 1};
		double[] caseCounts = {0, 0, 0};
	
		boolean gameState = true;
		boolean testCase = true;
		
		while(gameState)
		{
			init(arr);
			randomizeDoors(arr);
			caseTicker(arr, case1, case2, case3, caseCounts);

			runCount++;
			if(runCount == 1000000 && testCase)
				gameState = false;
		}
		
		
		runTimeStats(runCount, caseCounts);
	}
	public void init(int [] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			arr[i] = 0;
		}
	}
	public static void runTimeStats(int runCount, double[] caseCounts)
	{
		System.out.println("Number of time looped: " + runCount);
		System.out.println("Percentage of Case 1's: " + (double)(caseCounts[0]/runCount));
		System.out.println("Percentage of Case 2's: " + (double)(caseCounts[1]/runCount));
		System.out.println("Percentage of Case 3's: " + (double)(caseCounts[2]/runCount));

	}
	public void caseTicker(int[] arr,int[] case1,int[]  case2, int[] case3,double[] caseCounts)
	{
		if(arr[0] == 1)
			caseCounts[0]++;
		else if(arr[1] == 1)
			caseCounts[1]++;
		else if(arr[2] == 1)
			caseCounts[2]++;
	}
	public void randomizeDoors(int[] arr)
	{
		Random rand = new Random();
		double random = rand.nextDouble();
		//System.out.println(random);
		if(random > (.66))
		{
			arr[0] = 1;
			//System.out.println(random + " is greater than " + .66);
			random = -1;
		}
		else if(random > (.33))
	    {
			arr[1] = 1;
			//System.out.println(random + " is greater than " + .33 + "and less than .66");
			random = -1;
		}
		else if(random >= (.0))
		{
			arr[2] = 1;
			//System.out.println(random + " is greater than " + .0 + " and less than .33 and .66");
			random = -1;

		}
	}
	public void printArr(int[] arr){
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();

	}
	
}
