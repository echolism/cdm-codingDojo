package codingdojo.pokerhands;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PlayerTest {

  private final List<String> playerPokers;
  private final String expectedWinningStrategy;
  private final Integer expectedWinningFaceValue;

  public PlayerTest(final List<String> playerPokers, final String expectedWinningStrategy,
      final Integer expectedWinningFaceValue) {
    this.playerPokers = playerPokers;
    this.expectedWinningStrategy = expectedWinningStrategy;
    this.expectedWinningFaceValue = expectedWinningFaceValue;
  }

  @Parameters(name = "{index}: Given Player has {0}, When Player determine Winning Strategy Then Player will be able to get Winner Strategy {1} and Winning Face Value is {2}")
  public static Collection<Object> data() {
    return Arrays.asList(new Object[][]{
        {Arrays.asList("1H", "2H", "3D", "5D", "7S"), "High Card", 7}
    });
  }

  @Test
  public void assertWinningStrategy() {
    final Player player = new Player("A");
    player.collectPokers(playerPokers);
//
//    WinningStratey stratey = player.determineWinningStrategy();
//
//    assertEquals(expectedWinningStrategy, strategy.getWinningStrategy());
//    assertEquals(expectedWinningFaceValue, strategy.getWinningFaceValue());
  }

}
