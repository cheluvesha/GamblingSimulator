//"Welcome to Gambling Simulator"

class GamblingSimulator	
	{

		static int stakeAmount = 100;
		final static int BET_AMOUNT = 1;

		// Welcome message
		public static void welcomeMsg() 
		{

			System.out.println("Gambling will be started with $"+stakeAmount+" and the Bet amount will be $"+BET_AMOUNT);
			System.out.println("<---------------------------------------------------------------------------->");

		}

public static void main(String args[])
	{

        	welcomeMsg();

	}
	}

