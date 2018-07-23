package codingdojo.pokerhands.winning;

import codingdojo.pokerhands.Player;

public interface Determinable {

  Player determine(final Player p1, final Player p2);

  Determinable setNext(final Determinable nextWinningDeterminater);
}
