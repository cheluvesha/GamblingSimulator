//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator
	{
	
		static int stakeAmount = 100; 
		final static int BET_AMOUNT = 1;
        	
		// Welcome message
        	private static void welcomeMsg()
		{

	                System.out.println("Gambling will be started with $"+stakeAmount+" and the Bet amount will be $"+BET_AMOUNT);
        	        System.out.println("<---------------------------------------------------------------------------->");

        	}
        
		// Random number generation
        	private static int getRandom()	
		{
	
        		Random random = new Random();
        		return random.nextInt(2);
        	
		}
        
		// Win or Loose condition
        	private static void gameResultWinOrLoose()
		{
                	
			int gameResult = getRandom();
        		if( gameResult > 0 )
			{

	        		System.out.println("Win");
				System.out.println("The total amount will be: $"+( stakeAmount + BET_AMOUNT ));
       	
			}
			else
        		{

				System.out.println("Loss");
        			System.out.println("The total amount will be: $"+( stakeAmount - BET_AMOUNT ));
			
			}
		}

public static void main(String args[])
	{

	        welcomeMsg();
        	gameResultWinOrLoose();
	
	}
	}
