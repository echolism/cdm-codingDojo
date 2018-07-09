package codingdojo.pokerhands;

import java.util.Arrays;
import org.junit.Test;

public class PlayerTest {

  /**
   * Given Player has no Combination
   * When Player determine Winning Strategy
   * Then Player will be able to get High Card and Highest Card
   */
  @Test
  public void testPlayerHasNoCombinationWhenDetermineWinningStrategyThenCanGetHighCard() {
    Player player = new Player("A");
    player.collectPokers(Arrays.asList("1H", "2H", "3D", "5D", "7S"));

//    WinningStratey stratey = player.determineWinningStrategy();
//
//    assertEquals("High Card", strategy.getWinningStrategy());
  }
}
