public class GamblerUC1 {
    public static void main(String[] args) {
        int stake = 100;
//        int month = 30;
        int bet = 1;
        int games = 50;

        int bet_for_50_games = stake - games * bet;

//        int stake_for_month = stake * month;
//       System.out.println("stake_for_month" +stake_for_month);

        System.out.println("Remaining $ of the day = $" +bet_for_50_games);
    }
}
