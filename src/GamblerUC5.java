import java.util.Random;
public class GamblerUC5 {
    public static void main(String[] args) {
        int[] rand_array = new int[30];
        for(int i=0; i<20; i++){
            Random random = new Random();
            int rand_number = random.nextInt(100);
            System.out.println(rand_number);

            int daily_stake=100;
            int profit = daily_stake - rand_number;
            System.out.println("Daily Profit =  $"+profit);
            int loss = profit - rand_number;
            System.out.println("Daily Loss =  $"+loss);

            if(profit>50){
                System.out.println("Win by  $"+profit);
            }else{
                System.out.println("Loss by  $"+loss);
            }
        }
    }
}
