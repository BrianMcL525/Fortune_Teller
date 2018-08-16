import java.util.Scanner;

public class Fortune
{
	public static void main(String[] args)
	{
		char replay;
		char roll;
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to roll the dice to learn your fourtune");
		System.out.println("Press 'Y' to roll anything else to run away");
		
		roll = input.next().charAt(0);
		roll = Character.toUpperCase(roll);
		do
		{	
			if (roll != 'Y')
				break;
			Die Die1 = new Die();
			Die Die2 = new Die();
		
			int value1 = Die1.getValue();
			int value2 = Die2.getValue();
			final int TOTAL = value1 + value2;
			
			System.out.println("You have rolled a " + TOTAL + "!");
			switch(TOTAL)
			{
				case 2:
					System.out.println("You will have great luck today");
					break;
				case 3:
				case 4:
					System.out.println("You will narrowly escape death");
					break;
				case 5:
				case 6:
					System.out.println("You will live a boring life");
					break;
				case 7:
					System.out.println("You will have die today");
					break;
				case 8:
				case 9:
					System.out.println("You will soon have great wealth");
					break;
				case 10:
				case 11:
					System.out.println("You will soon be living your dream life");
					break;
				case 12:
					System.out.println("You will soon make someone happy"); 
			}
			System.out.println("Would you like your fourtune told again, enter 'Y' for yes anything else for no");
			
			replay = input.next().charAt(0);
			replay = Character.toUpperCase(replay);
			
			while(TOTAL == 7)
			{
				System.out.println("YOUR FATE IS UNESCAPEABLE");
			}
			
		}while(replay == 'Y');
	}
}