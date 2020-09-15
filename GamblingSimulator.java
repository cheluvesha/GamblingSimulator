//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator
	{
        	static int stakeAmount = 100;
        	static final int BET_AMOUNT = 1;
        	static final int STOP_IF_WIN = 150;// 50% profit with additional to initial>
        	static final int STOP_IF_LOOSES = 50;// 50% loss with respect to stakeAmount
        	static int monthLoss = 0, monthWin = 0;// to store month loss and win
        	static int luckyDay = 0, unluckyDay = 0, luckyOrUnluckyAmount = 0;
        	static int maxWin = 0, maxLoss = 0;// to store maximum win and maximum loss
      		static int month = 0;
      		static int overallMonthWin = 0;
      		static int overallMonthLoss = 0;
		static final int DAYS_LIMIT = 30;
		// Welcome message
      		private static void welcomeMsg()
		{    		
			System.out.println("Gambling will be started with $"+stakeAmount+" and the bet amount will be $"+BET_AMOUNT);
      			System.out.println("<--------------------------------------------------------------------------------------->");    		
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
	  		month = 1;
			// Condition to continue if current month Win rate is high against Loss
            		do
			{
            			int storeAmount[] = new int[30];
                    		monthLoss = 0;
                    		monthWin = 0;
                    		luckyDay = 0;
                    		unluckyDay = 0;
	                  	luckyOrUnluckyAmount = 0;
	                        maxWin = 0;
             	                maxLoss = 0;
		                overallMonthWin = 0;
		                overallMonthLoss = 0;
		                System.out.println();
		                System.out.println("MONTH NO "+month+" REPORT");
		                System.out.println("<----------------------------------------------------------------------------------------->");
		                for( int day = 1; day <= DAYS_LIMIT; day++ )
				{                    
					stakeAmount = 100;
					// Daily report
                    			while(stakeAmount > STOP_IF_LOOSES && stakeAmount < STOP_IF_WIN)
					{                 			
						int gameResult = getRandom();
                    				if (gameResult > 0)                   
							++stakeAmount;
	       				        else                    	
							--stakeAmount;                    				
					}
					// Condition to resign for the day
                    			if(stakeAmount == STOP_IF_LOOSES)
					{                    				
						System.out.println("He Lost $"+stakeAmount+ " with the "+day+" day");
                    				monthLoss += 50;
                    				luckyOrUnluckyAmount -= 50;
                    				storeAmount[day-1] = luckyOrUnluckyAmount;                    
					}
                    			else
					{                    
						System.out.println("He Won $"+(stakeAmount-100)+ " with the "+day+" day");
                    				monthWin += 50;
                    				luckyOrUnluckyAmount += 50;
                    				storeAmount[day-1] = luckyOrUnluckyAmount;
       					}
                    		}
		    		System.out.println("<------------------------------------------------------->");
                    		System.out.println("Month Loss is $"+monthLoss);
                    		System.out.println("Month Wins is $"+monthWin);
                    		System.out.println("<------------------------------------------------------->");		    		
				// Condition to store Overall Loss or Overall Win
                    		if(monthLoss > monthWin)
				{                    
					overallMonthLoss = monthLoss - monthWin;
                    			System.out.println("The total amount lost is $"+ overallMonthLoss+" so he will Quit");
                    		}                   
                    		else
				{
      					overallMonthWin = monthWin - monthLoss;
                    			System.out.println("The total amount Won is $"+ overallMonthWin+" so he will continue for next month");		    
				}	
                    		getLuckyOrUnluckyDay(storeAmount);
        	            	month++;
                    	}while(monthWin >= monthLoss);                  
		}		
		 // to determine maximum win or loose amount and also the lucky or unlucky day
                private static void getLuckyOrUnluckyDay(int arr[])
		{
       			maxWin = arr[0];
                        maxLoss = arr[0];
                	for(int i = 0; i<arr.length; i++)
			{	
                            if(maxWin < arr[i])
			    {
      				maxWin = arr[i];
                                luckyDay = i+1;			    
			    }
                            if(maxLoss > arr[i])
			    {
				maxLoss = arr[i];
                                unluckyDay = i+1;
                            }
                    	}
                    	System.out.println("<--------------------------------------------------------------------------------------->");
                    	System.out.println("The Luckiest day for the gambler is "+luckyDay);
	                System.out.println("The Unluckiest day for the gambler is "+unluckyDay);
		    	System.out.println("<--------------------------------------------------------------------------------------->");
                    	System.out.println("The maximum win amount which gambler got is "+maxWin);
                    	System.out.println("The maximum loss amount which gambler got is "+maxLoss);
                  }

		public static void main(String args[])
		{
			welcomeMsg();
     			monthReport();
	}
}
