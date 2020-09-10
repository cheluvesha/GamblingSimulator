//"Welcome to Gambling Simulator"

import java.util.Random;
class GamblingSimulator
	{
        
		static int stakeAmount = 100;
        	final static int BET_AMOUNT = 1;
		static double percentage = 50.00;
        	final static int STOP_IF_WIN = stakeAmount + (int)(( percentage /  100 * stakeAmount ));// 50% profit with additional to initial amount
		final static int STOP_IF_LOOSES = stakeAmount - (int)(( percentage /  100 * stakeAmount ));// 50% loss with respect to stakeAmount
        	static int twentyDayLoss = 0, twentyDayWin = 0;
        	final static int DAYS_LIMIT = 20; 
	
		// Welcome message
        	private static void welcomeMsg()	
		{
        
	        	System.out.println("Gambling will be started with $"+stakeAmount+" and the bet amount will be $"+BET_AMOUNT);
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
	
        	        	stakeAmount = 100;
               
		 		// Daily report start
                		while( stakeAmount > STOP_IF_LOOSES && stakeAmount < STOP_IF_WIN )
				{
                
					int gameResult = getRandom();
                			if ( gameResult > 0 )
						
                				++stakeAmount;
					
					else
						
                				--stakeAmount;
					
               		 	}// Daily report end
               
		 		// Condition for resign
                		if( stakeAmount == STOP_IF_LOOSES )
				{
	
                			System.out.println("He Lost $"+stakeAmount+ " with the "+day+" day");
                			twentyDayLoss += 50;
        
		       	 	}
                		else
				{
                
					System.out.println("He Won $"+(stakeAmount - 100)+ " with the "+day+" day");
        	        		twentyDayWin += 50;
        	
				}
        			}
	
			System.out.println("<------------------------------------------------------>");
        
			// Condition to check whether its a Loss Or Win with respect to Twenty days
       			if( twentyDayLoss > twentyDayWin )
				
        			System.out.println("The total amount lost is $"+(twentyDayLoss - twentyDayWin));
			
        		else if( twentyDayLoss == twentyDayWin )
				
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

