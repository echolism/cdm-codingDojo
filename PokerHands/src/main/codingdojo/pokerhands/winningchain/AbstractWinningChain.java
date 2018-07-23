package codingdojo.pokerhands.winningchain;

import codingdojo.pokerhands.Player;

public abstract class AbstractWinningChain implements WinningChain {

  private WinningChain nextWinningChain;

  public WinningChain setNext(final WinningChain nextWinningChain) {
    this.nextWinningChain = nextWinningChain;
    return nextWinningChain;
  }

  public Player getWinner(final Player p1, final Player p2) {
    final Player winner = getWinnerByWinningChain(p1, p2);
    if (winner != null) {
      return winner;
    }
    if (nextWinningChain != null) {
      return nextWinningChain.getWinner(p1, p2);
    }
    return null;
  }

  protected abstract Player getWinnerByWinningChain(final Player p1, final Player p2);
}
