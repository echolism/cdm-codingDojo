package codingdojo.pokerhands.winning;

import codingdojo.pokerhands.Player;

public class ThreeOfAKindDeterminater extends Determinater {

  @Override
  protected Player getWinner(Player p1, Player p2) {
    if (p1.hasThreeOfAKind()) {
      return p1;
    }

    return null;
  }
}
