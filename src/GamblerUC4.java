import java.util.Random;

public class GamblerUC4 {
    public static void main(String[] args) {
        int[] rand_array = new int[20];
        for(int i=0; i<20; i++){
            Random random = new Random();
            int rand_number = random.nextInt(100);
            System.out.println(rand_number);

            int daily_stake=100;
            int profit = daily_stake - rand_number;
            System.out.println("Daily Profit =  $"+profit);
            int loss = profit - rand_number;
            System.out.println("Daily Loss =  $"+loss);
        }

    }
}
