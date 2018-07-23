package codingdojo.pokerhands.winningchain;

import codingdojo.pokerhands.Player;
import codingdojo.pokerhands.Poker;
import java.util.List;

public class TwoPairWinningChain extends AbstractWinningChain {

  @Override
  protected Player getWinnerByWinningChain(final Player p1, final Player p2) {
    if (p1.hasTwoPairs() && p2.hasTwoPairs()) {
      List<Poker> p1Pairs = p1.getAllPairs();
      List<Poker> p2Pairs = p2.getAllPairs();

      for (int i = 0; i < 2; i++) {
        if (p1Pairs.get(i).compareTo(p2Pairs.get(i)) > 0) {
          return p1;
        }
        if (p2Pairs.get(i).compareTo(p1Pairs.get(i)) > 0) {
          return p2;
        }
      }
    }

    if (p1.hasTwoPairs() && !p2.hasTwoPairs()) {
      return p1;
    } else if (!p1.hasTwoPairs() && p2.hasTwoPairs()) {
      return p2;
    }
    return null;
  }
}
