package codingdojo.pokerhands;

import java.util.List;

public class PokerHands {

    public static final String PLAYER_1_WIN_MSG = "Player 1 wins.";
    public static final String PLAYER_2_WIN_MSG = "Player 2 wins.";
    public static final String DRAW_GAME_MSG = "Draw Game";

    public String determine(Player p1, Player p2) {
        Player winner = getWinner(p1, p2);
        return winner == null ? DRAW_GAME_MSG : String.format("%s wins.", winner.getName());
    }

    private Player getWinner(Player p1, Player p2) {
        final Player twoPairWinner = getWinnerInTwoPair(p1, p2);
        if (twoPairWinner != null) {
            return twoPairWinner;
        }

        final Player pairWinner = getWinnerInPair(p1, p2);
        if (pairWinner != null) {
            return pairWinner;
        }

        return getWinnerInSinglePoker(p1, p2);
    }

    private Player getWinnerInTwoPair(Player p1, Player p2) {

        if (p1.hasTwoPairs() && p2.hasTwoPairs()) {
            List<Poker> p1Pairs = p1.getAllPairs();
            List<Poker> p2Pairs = p2.getAllPairs();

            for (int i=0; i< 2; i++) {
                if(p1Pairs.get(i).compareTo(p2Pairs.get(i)) > 0)
                    return  p1;
                if(p2Pairs.get(i).compareTo(p1Pairs.get(i)) > 0)
                    return  p2;
            }
        }

        if (p1.hasTwoPairs() && !p2.hasTwoPairs()) {
            return p1;
        } else if (!p1.hasTwoPairs() && p2.hasTwoPairs()){
            return p2;
        }
        return null;
    }


    private Player getWinnerInPair(Player p1, Player p2) {
        if (p1.hasPair() && p2.hasPair()) {
            if (p1.getPair().compareTo(p2.getPair()) > 0) return p1;
            if (p1.getPair().compareTo(p2.getPair()) < 0) return p2;
        }

        if (p1.hasPair() && !p2.hasPair()) {
            return p1;
        } else if (!p1.hasPair() && p2.hasPair()){
            return p2;
        }
        return null;
    }

    private Player getWinnerInSinglePoker(Player p1, Player p2) {
        for (int i = 0; i < 5; i++) {
            if (p1.getHighestPoker(i).compareTo(p2.getHighestPoker(i)) > 0) {
                return p1;
            } else if (p2.getHighestPoker(i).compareTo(p1.getHighestPoker(i)) > 0) {
                return p2;
            }
        }
        return null;
    }
}
