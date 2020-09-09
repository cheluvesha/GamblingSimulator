//"Welcome to Gambling Simulator"
import java.util.Random;
class GamblingSimulator{
        static int initialAmount=100;
        static int betAmount=1;
        // Welcome message
        public static void welcomeMsg(){
                System.out.println("Gambling will be started with $"+initialAmount+" and the Bet amount will be $"+betAmount);
                System.out.println("<---------------------------------------------------------------------------->");

        }
        // Random number generation
        private static int getRandom(){
        Random random=new Random();
        return random.nextInt(2);
        }
        // Win or Loose condition
        private static void resultWinOrLoose(){
                int result=getRandom();
         System.out.println(result);
        if(result>0)
        System.out.println("Win");
        else
        System.out.println("Loss");
        }

public static void main(String args[]){
        welcomeMsg();
        resultWinOrLoose();
}
}
