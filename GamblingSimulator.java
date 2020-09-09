//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator{
        static int initialAmount=100;
        final static int betAmount=1;
        final static int stopOfWin=150;// 50% profit with additional to initial amount
        final static int stopOfLoss=50;// 50% loss with respect to initialamount
        static int twentyDayLoss=0,twentyDayWin=0;
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
        // 20 days report
        private static void getTwentyDaysReport(){
                for( int day=1; day<=20; day++ ){

                initialAmount=100;
                // Daily report start
                while(initialAmount > stopOfLoss && initialAmount < stopOfWin){
                int result=getRandom();

                if (result > 0)
                ++initialAmount;

                else
                --initialAmount;
                }// Daily report end
                // Condition for resign
                if(initialAmount == stopOfLoss){
                System.out.println("He Lost $"+initialAmount+ " with the "+day+" day");
                twentyDayLoss+=50;
                }
                else{
                System.out.println("He Won $"+(initialAmount-100)+ " with the "+day+" day");
                twentyDayWin+=50;
        }
        }
	System.out.println("<------------------------------------------------------>");
        // Condition to check whether its a Loss Or Win with respect to Twenty days
        if(twentyDayLoss > twentyDayWin)
        System.out.println("The total amount lost is $"+(twentyDayLoss-twentyDayWin));
        else if(twentyDayLoss == twentyDayWin)
        System.out.println("The Loss or Win is $0");
        else
        System.out.println("The total amount Won is $"+(twentyDayWin-twentyDayLoss));
        System.out.println("<------------------------------------------------------>");

}
public static void main(String args[]){
        welcomeMsg();
        getTwentyDaysReport();
}
}

