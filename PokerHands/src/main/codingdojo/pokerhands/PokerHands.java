package codingdojo.pokerhands;

import codingdojo.pokerhands.winningchain.HighCardWinningChain;
import codingdojo.pokerhands.winningchain.PairWinningChain;
import codingdojo.pokerhands.winningchain.ThreeOfAKindWinningChain;
import codingdojo.pokerhands.winningchain.TwoPairWinningChain;
import codingdojo.pokerhands.winningchain.WinningChain;

public class PokerHands {

  public static final String PLAYER_1_WIN_MSG = "Player 1 wins.";
  public static final String PLAYER_2_WIN_MSG = "Player 2 wins.";
  public static final String DRAW_GAME_MSG = "Draw Game";

  private final WinningChain highCardWinningChain = new HighCardWinningChain();
  private final WinningChain pairWinningChain = new PairWinningChain();
  private final WinningChain twoPairWinningChain = new TwoPairWinningChain();
  private final WinningChain threeOfAKindWinningChain = new ThreeOfAKindWinningChain();

  public String determine(final Player p1, final Player p2) {
    final Player winner = getHighestPriorityWinningChain().getWinner(p1, p2);
    return winner == null ? DRAW_GAME_MSG : String.format("%s wins.", winner.getName());
  }

  private WinningChain getHighestPriorityWinningChain() {
    threeOfAKindWinningChain
        .setNext(twoPairWinningChain)
        .setNext(pairWinningChain)
        .setNext(highCardWinningChain);
    return threeOfAKindWinningChain;
  }

}
