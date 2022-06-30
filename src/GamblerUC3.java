import java.util.Random;

public class GamblerUC3 {
    public static void main(String[] args) {

        Random random = new Random();
        int lossnumber = random.nextInt(75);
        System.out.println("Loss of the day from total stake of 100: " +lossnumber);



        if (lossnumber > 50) {
            System.out.println("Gambler resign for the day");
        } else {
            System.out.println("Gambler will play the game");




        }
    }
}