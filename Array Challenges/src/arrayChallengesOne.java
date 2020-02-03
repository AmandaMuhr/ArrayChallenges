import java.util.Scanner;

public class arrayChallengesOne
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();
			}
		
		public static void challengeOne()
			{
				String[]avengers = new String [6];
				avengers [0] = "Captain America";
				avengers [1] = "Iron Man";
				avengers [2] = "Black Widow";
				avengers [3] = "Thor";
				avengers [4] = "Hawkeye";
				avengers [5] = "The Hulk";

				System.out.println(avengers[2]);	
				System.out.println(" ");
			}
		
		public static void challengeTwo()
			{
				int [] numbers = new int [4];
				numbers [0] = 5;
				numbers [1] = 2;
				numbers [2] = 8;
				numbers [3] = 0;
				
				System.out.println(numbers[numbers.length-1]);
				System.out.println(" ");
			}
		
		public static void challengeThree()
			{
				int [] numbers = new int [4];
				numbers [0] = 5;
				numbers [1] = 2;
				numbers [2] = 8;
				numbers [3] = 0;
				
				for (int i = 0; i < numbers.length; i++)
					{
						System.out.println(numbers[i]);
						System.out.println(" ");
					}
			}
		
		public static void challengeFour()
			{
				double sum = 0;
				
				double [] numbers = new double [4];
				numbers [0] = 5;
				numbers [1] = 2;
				numbers [2] = 8;
				numbers [3] = 0;
				
				for (int i = 0; i < numbers.length; i++)
					{
						sum += numbers[i];
					}
				
				System.out.println(sum/numbers.length);
						
					
			}
	
	}
