package codingdojo.pokerhands.winning;

import codingdojo.pokerhands.Player;

public class PairDeterminater extends Determinater {

  @Override
  protected Player getWinner(final Player p1, final Player p2) {
    if (p1.hasPair() && p2.hasPair()) {
      if (p1.getPair().compareTo(p2.getPair()) > 0) {
        return p1;
      }
      if (p1.getPair().compareTo(p2.getPair()) < 0) {
        return p2;
      }
    }

    if (p1.hasPair() && !p2.hasPair()) {
      return p1;
    } else if (!p1.hasPair() && p2.hasPair()) {
      return p2;
    }
    
    return null;
  }
}
