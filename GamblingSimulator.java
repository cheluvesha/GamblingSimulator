//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator
	{
        
	static int initialAmount = 100;
        final static int BET_AMOUNT = 1;
	static double percentage = 50.00;
        final static int STOP_IF_WIN = initialAmount + (int)(( percentage /  100 * initialAmount ));// 50% profit with additional to initial amount
        final static int STOP_IF_LOOSES = initialAmount - (int)(( percentage /  100 * initialAmount ));// 50% loss with respect to initialamount

	// Welcome message
        private static void welcomeMsg()
	{

                System.out.println("Gambling will be started with $"+initialAmount+" and the bet amount will be $"+ BET_AMOUNT);
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
        
	        while( initialAmount > STOP_IF_LOOSES && initialAmount < STOP_IF_WIN )
		{
	
                	int gameResult = getRandom();
                	if ( gameResult > 0 )
              			++initialAmount;
                	else
                		--initialAmount;
            
	 	}

                // Condition to check whether he has to resign for the day
                if( initialAmount == STOP_IF_LOOSES )
	                System.out.println("He Lost $"+initialAmount+ " for a day");
                else
        	        System.out.println("He Won $"+(initialAmount - 100)+ " for a day");

        }

public static void main(String args[]){
        welcomeMsg();
        resignForTheDay();
}
}

