//"Welcome to Gambling Simulator"

class GamblingSimulator	
	{

        static int initialAmount = 100;
	final static int betAmount = 1;
        
	// Welcome message
        public static void welcomeMsg() 
	{

                System.out.println("Gambling will be started with $"+initialAmount+" and the Bet amount will be $"+betAmount);
                System.out.println("<---------------------------------------------------------------------------->");

        }

public static void main(String args[]){

        welcomeMsg();

	}
	}

