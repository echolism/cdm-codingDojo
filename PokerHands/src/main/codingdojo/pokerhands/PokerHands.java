package codingdojo.pokerhands;

import codingdojo.pokerhands.winning.HighCardDeterminater;
import codingdojo.pokerhands.winning.PairDeterminater;
import codingdojo.pokerhands.winning.ThreeOfAKindDeterminater;
import codingdojo.pokerhands.winning.TwoPairDeterminater;
import codingdojo.pokerhands.winning.Determinable;

public class PokerHands {

  public static final String PLAYER_1_WIN_MSG = "Player 1 wins.";
  public static final String PLAYER_2_WIN_MSG = "Player 2 wins.";
  public static final String DRAW_GAME_MSG = "Draw Game";

  private final Determinable highCardDeterminater = new HighCardDeterminater();
  private final Determinable pairDeterminater = new PairDeterminater();
  private final Determinable twoPairDeterminater = new TwoPairDeterminater();
  private final Determinable threeOfAKindDeterminater = new ThreeOfAKindDeterminater();

  public String determine(final Player p1, final Player p2) {
    final Player winner = getHighestPriorityWinningChain().determine(p1, p2);
    return winner == null ? DRAW_GAME_MSG : String.format("%s wins.", winner.getName());
  }

  private Determinable getHighestPriorityWinningChain() {
    threeOfAKindDeterminater
        .setNext(twoPairDeterminater)
        .setNext(pairDeterminater)
        .setNext(highCardDeterminater);
    return threeOfAKindDeterminater;
  }

}
