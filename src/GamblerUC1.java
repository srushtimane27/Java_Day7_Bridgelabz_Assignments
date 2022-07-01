public class GamblerUC1 {
    public static void main(String[] args) {

        int stake = 100;
        int bet = 1;
        int games = 50;

        int bet_for_50_games = stake - games * bet;
        System.out.println("Remaining $ of the day = $" +bet_for_50_games);
    }
}
