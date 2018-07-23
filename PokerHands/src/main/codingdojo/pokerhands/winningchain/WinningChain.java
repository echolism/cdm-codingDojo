package codingdojo.pokerhands.winningchain;

import codingdojo.pokerhands.Player;

public interface WinningChain {

  Player getWinner(final Player p1, final Player p2);

  WinningChain setNext(final WinningChain nextWinningChain);
}
