//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator
	{
        
		static int stakeAmount = 100;
        	final static int BET_AMOUNT = 1;
		static double percentage = 50.00;
        	final static int STOP_IF_WIN = stakeAmount + (int)(( percentage /  100 * stakeAmount ));// 50% profit with additional to initial amount
       		final static int STOP_IF_LOOSES = stakeAmount - (int)(( percentage /  100 * stakeAmount ));// 50% loss with respect to stakeAmount

		// Welcome message
        	private static void welcomeMsg()
		{

               		System.out.println("Gambling will be started with $"+stakeAmount+" and the bet amount will be $"+ BET_AMOUNT);
                	System.out.println("<---------------------------------------------------------------------------->");

      		 }

       		// Random number generation
        	private static int getRandom()
		{
	
                	Random random =	new Random();
                	return random.nextInt(2);
        
		}
	
        	// Win or Loose condition
        	private static void resignForTheDay()	
		{
        
	        	while( stakeAmount > STOP_IF_LOOSES && stakeAmount < STOP_IF_WIN )
			{
	
                		int gameResult = getRandom();
                		if ( gameResult > 0 )
					
              				++stakeAmount;
				
                		else
					
                			--stakeAmount;
            
	 		}

                	// Condition to check whether he has to resign for the day.
                	if( stakeAmount == STOP_IF_LOOSES )
				
	                	System.out.println("He Lost $"+stakeAmount+ " for a day");
			
                	else
				
        	        	System.out.println("He Won $"+(stakeAmount - 100)+ " for a day");
                                                                                        
        		}

public static void main(String args[])
	{
	
        	welcomeMsg();
        	resignForTheDay();
	
	}
	}

