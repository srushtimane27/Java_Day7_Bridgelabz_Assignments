import java.util.Random;
public class GamblerUC6 {
    public static void main(String[] args) {
        int[] rand_array = new int[30];
        for(int i=0; i<20; i++){
            Random random = new Random();
            int rand_number = random.nextInt(100);     //number of games he played out of 100 each for $1
            System.out.println(rand_number);

            int daily_stake=100;
            int profit = daily_stake - rand_number;
            System.out.println("Daily Profit =  $"+profit);
            int loss = profit - rand_number;
            System.out.println("Daily Loss =  $"+loss);

            if(profit>50){
                System.out.println("Lucky Day!! Win by  $"+profit);
            }else{
                System.out.println("Unlucky Day!!Loss by  $"+loss);
            }
        }
    }
}
