//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator
	{
	
		static int initialAmount = 100; 
		final static int BET_AMOUNT = 1;
        	
		// Welcome message
        	private static void welcomeMsg()
		{

	                System.out.println("Gambling will be started with $"+initialAmount+" and the Bet amount will be $"+BET_AMOUNT);
        	        System.out.println("<---------------------------------------------------------------------------->");

        	}
        
		// Random number generation
        	private static int getRandom()	
		{
	
        		Random random = new Random();
        		return random.nextInt(2);
        	
		}
        
		// Win or Loose condition
        	private static void resultWinOrLoose()
		{
                	
			int gameResult = getRandom();
        		System.out.println(result);
        		if( gameResult > 0 )
        		System.out.println("Win");
       			else
        		System.out.println("Loss");
        	
		}

public static void main(String args[])
	{

	        welcomeMsg();
        	resultWinOrLoose();
	
	}
	}
