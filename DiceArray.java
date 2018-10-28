package package1;

public class DiceArray 
{

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int[] diceArray = new int [11];
		
		for (int i = 0; i < 1000; i++)
		{
			diceArray[dice1.roll() + dice2.roll() - 2] += 1;
		}
		
		for (int i = 0; i < 11; i++)
		{
			System.out.println("The number " + (i + 2) + " was rolled " + diceArray[i] + " times.");
		}
	}
}
