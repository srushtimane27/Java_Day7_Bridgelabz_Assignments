import java.util.Random;

import static java.lang.Math.random;

public class GamblerUC2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(2);
        System.out.println(number);

        if (number == 1) {
            System.out.println("Gambler win $1");
        }else{
            System.out.println("Gambler loose $1");

        }

    }

}
