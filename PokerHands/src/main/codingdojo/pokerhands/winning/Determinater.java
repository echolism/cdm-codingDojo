package codingdojo.pokerhands.winning;

import codingdojo.pokerhands.Player;

public abstract class Determinater implements Determinable {

  private Determinable nextDeterminater;

  public Determinable setNext(final Determinable nextDeterminater) {
    this.nextDeterminater = nextDeterminater;
    return nextDeterminater;
  }

  public Player determine(final Player p1, final Player p2) {
    final Player winner = getWinner(p1, p2);
    if (winner != null) {
      return winner;
    }
    if (nextDeterminater != null) {
      return nextDeterminater.determine(p1, p2);
    }
    return null;
  }

  protected abstract Player getWinner(final Player p1, final Player p2);
}
