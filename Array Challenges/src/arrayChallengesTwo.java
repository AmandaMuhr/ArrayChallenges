import java.util.Scanner;

public class arrayChallengesTwo
	{

		public static void main(String[] args)
			{
				printingOutSquares();
				convertingMonthNumbersToNames();
				pickACard();
				extraCreditOne();
				

			}
		
		public static void printingOutSquares()

			{
				int [] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
				
				for (int i = 0; i < numbers.length; i++)
					{
						System.out.println(numbers[i] * numbers[i]);
					}
				
				System.out.println(" ");
			}
			
			
		public static void convertingMonthNumbersToNames()
			{ 
				String [] monthNames = new String [12];
				monthNames [0] = "January";
				monthNames [1] = "February";
				monthNames [2] = "March";
				monthNames [3] = "April";
				monthNames [4] = "May";
				monthNames [5] = "June";
				monthNames [6] = "July";
				monthNames [7] = "August";
				monthNames [8] = "September";
				monthNames [9] = "October";
				monthNames [10] = "November";
				monthNames [11] = "December";
				
				Scanner userIntInput = new Scanner(System.in);
				
				System.out.println("Please input a number, and I will tell you the month it corresponds with.");
				int number = userIntInput.nextInt();
				
				System.out.println(monthNames[number-1]);
				System.out.println(" ");
					
			}
			
		public static void pickACard() 
			{
				String [] cardSuits = new String [4];
				cardSuits [0] = "Spades";
				cardSuits [1] = "Hearts";
				cardSuits [2] = "Diamonds";
				cardSuits [3] = "Clubs";
				
				String [] cardValues = new String [13];
				cardValues [0] = "Ace";
				cardValues [1] = "Two";
				cardValues [2] = "Three";
				cardValues [3] = "Four";
				cardValues [4] = "Five";
				cardValues [5] = "Six";
				cardValues [6] = "Seven";
				cardValues [7] = "Eight";
				cardValues [8] = "Nine";
				cardValues [9] = "Ten";
				cardValues [10] = "Jack";
				cardValues [11] = "Queen";
				cardValues [12] = "King";
				
				int suit = (int) (Math.random() * 3) + 1;
				int number = (int) (Math.random() * 11) + 1;
				
				System.out.println(cardValues[number] + " of " + cardSuits[suit] );
			}
		
		public static void extraCreditOne()
			{
				
			}
		

		

	}
