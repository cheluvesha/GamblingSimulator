//"Welcome to Gambling Simulator"

import java.util.Random;
class GamblingSimulator
	{
        
	static int initialAmount = 100;
        final static int BET_AMOUNT = 1;
	static double percentage = 50.00;
        final static int STOP_IF_WIN = initialAmount + (int)(( percentage /  100 * initialAmount ));// 50% profit with additional to initial amount
        final static int STOP_IF_LOOSES = initialAmount - (int)(( percentage /  100 * initialAmount ));// 50% loss with respect to initialamount
        static int twentyDayLoss = 0, twentyDayWin = 0;
        final static int DAYS_LIMIT = 20; 
	
	// Welcome message
        private static void welcomeMsg()	
	{
        
	        System.out.println("Gambling will be started with $"+initialAmount+" and the bet amount will be $"+BET_AMOUNT);
                System.out.println("<---------------------------------------------------------------------------->");
        
	}
        
	// Random number generation
        private static int getRandom()	
	{

                Random random = new Random();
                return random.nextInt(2);

        }

        // 20 days report
        private static void getTwentyDaysReport()
	{
                for( int day = 1; day <= DAYS_LIMIT ; day++ )
		{
	
        	        initialAmount = 100;
               
		 	// Daily report start
                	while(initialAmount > STOP_IF_LOOSES && initialAmount < STOP_IF_WIN)
			{
                
				int gameResult = getRandom();
                		if (gameResult > 0)
                			++initialAmount;
				else
                			--initialAmount;
               		 }// Daily report end
               
		 	// Condition for resign
                	if(initialAmount == STOP_IF_LOOSES)
			{
	
                		System.out.println("He Lost $"+initialAmount+ " with the "+day+" day");
                		twentyDayLoss += 50;
        
		        }
                	else
			{
                
				System.out.println("He Won $"+(initialAmount - 100)+ " with the "+day+" day");
        	        	twentyDayWin += 50;
        	
			}
        		}
	
		System.out.println("<------------------------------------------------------>");
        
		// Condition to check whether its a Loss Or Win with respect to Twenty days
       		if(twentyDayLoss > twentyDayWin)
        		System.out.println("The total amount lost is $"+(twentyDayLoss - twentyDayWin));
        	else if(twentyDayLoss == twentyDayWin)
       			System.out.println("The Loss or Win is $0");
       		else
        		System.out.println("The total amount Won is $"+(twentyDayWin - twentyDayLoss));
        	System.out.println("<------------------------------------------------------>");

	}
	
public static void main(String args[])
	{

	        welcomeMsg();
        	getTwentyDaysReport();
	
	}
	}

