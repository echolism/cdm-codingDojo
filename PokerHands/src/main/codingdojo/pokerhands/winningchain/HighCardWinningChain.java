package codingdojo.pokerhands.winningchain;

import codingdojo.pokerhands.Player;

public class HighCardWinningChain extends AbstractWinningChain {

  @Override
  protected Player getWinnerByWinningChain(final Player p1, final Player p2) {
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
