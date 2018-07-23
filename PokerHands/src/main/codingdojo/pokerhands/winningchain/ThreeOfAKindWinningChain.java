package codingdojo.pokerhands.winningchain;

import codingdojo.pokerhands.Player;

public class ThreeOfAKindWinningChain extends AbstractWinningChain {

  @Override
  protected Player getWinnerByWinningChain(Player p1, Player p2) {
    if (p1.hasThreeOfAKind()) {
      return p1;
    }

    return null;
  }
}
