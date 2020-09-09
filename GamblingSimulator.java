//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator{
        static int initialAmount=100;
        final static int betAmount=1;
        final static int stopOfWin=150;// 50% profit with additional to initial amount
        final static int stopOfLoss=50;// 50% loss with respect to initialamount
        // Welcome message
        private static void welcomeMsg(){
                System.out.println("Gambling will be started with $"+initialAmount+" and the bet amount will be $"+betAmount);
                System.out.println("<---------------------------------------------------------------------------->");
        }
        // Random number generation
        private static int getRandom(){
                Random random=new Random();
                return random.nextInt(2);
        }
        // Win or Loose condition
        private static void resignForTheDay(){
                while(initialAmount > stopOfLoss && initialAmount < stopOfWin){
                int result=getRandom();
                if (result > 0)
                ++initialAmount;
                else
                --initialAmount;
                }
                // Condition to check whether he has to resign for the day
                if(initialAmount == stopOfLoss)
                System.out.println("He Lost $"+initialAmount+ " for a day");
                else
                System.out.println("He Won $"+(initialAmount-100)+ " for a day");

        }

public static void main(String args[]){
        welcomeMsg();
        resignForTheDay();
}
}

