package codingdojo.pokerhands;

public class PokerHands {

    public static final String PLAYER_1_WIN_MSG = "Player 1 wins.";
    public static final String PLAYER_2_WIN_MSG = "Player 2 wins.";
    public static final String DRAW_GAME_MSG = "Draw Game";

    public String determine(Player p1, Player p2) {
        Player winner = getWinner(p1, p2);
        return winner == null ? DRAW_GAME_MSG : String.format("%s wins.", winner.getName());
    }

    private Player getWinner(Player p1, Player p2) {
        if (p1.hasPair() && !p2.hasPair()) {
            return p1;
        }
        if (p2.hasPair()) {
            return p2;
        }
        if (p1.getHighestPoker().getFaceValue() > p2.getHighestPoker().getFaceValue()) {
            return p1;
        } else if (p1.getHighestPoker().getFaceValue() < p2.getHighestPoker().getFaceValue()) {
            return p2;
        }
        return null;
    }
}
