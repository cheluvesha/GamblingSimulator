//"Welcome to Gambling Simulator"

import java.util.Random;
class GamblingSimulator
	{

	static int initialAmount = 100;
        final static int BET_AMOUNT = 1;
	static double percentage = 50.00;
        final static int STOP_IF_WIN = initialAmount + (int)(( percentage /  100 * initialAmount ));// 50% profit with additional to initial amount
        final static int STOP_IF_LOOSES = initialAmount - (int)(( percentage /  100 * initialAmount ));// 50% loss with respect to initialamount
        final static int DAYS_LIMIT = 30;
	static int monthLoss = 0, monthWin = 0;// to store month loss and win
	
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
        
	// Generate Month report
        private static void monthReport()	
		{
        
	        	for( int day = 1; day <= 30; day++ )
			{

                		initialAmount = 100;
               	
		 		// Daily report
                		while(initialAmount > STOP_IF_LOOSES && initialAmount < STOP_IF_WIN)
				{

                			int gameResult = getRandom();
                			if (gameResult > 0)
        		        		++initialAmount;
                			else
                				--initialAmount;
               			 }
	
                		// Condition to resign for the day
        		        if(initialAmount  == STOP_IF_LOOSES)
				{
	
                			System.out.println("He Lost $"+initialAmount+ " with the "+day+" day");
               				monthLoss += 50;
        
			       	}
                		else
				{
                
					System.out.println("He Won $"+(initialAmount-100)+ " with the "+day+" day");
                			monthWin += 50;
        			
				}
        			}
	
				System.out.println("<------------------------------------------------------->");
        			System.out.println("Month Loss is $"+monthLoss);
        			System.out.println("Month Wins is $"+monthWin);
				System.out.println("<------------------------------------------------------->");
	
				// Condition to print Overall Loss or Overall Win
        			if(monthLoss > monthWin)
        				System.out.println("The total amount lost is $"+(monthLoss - monthWin));
      				else if(monthLoss == monthWin)
        				System.out.println("The Loss or Win is $0");
        			else
        				System.out.println("The total amount Won is $"+(monthWin - monthLoss));
        			}

public static void main(String args[])
	{
        	welcomeMsg();
        	monthReport();
	}
	}

