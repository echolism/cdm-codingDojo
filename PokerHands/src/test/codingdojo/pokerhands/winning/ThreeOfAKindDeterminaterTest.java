package codingdojo.pokerhands.winning;

import static org.junit.Assert.*;

import codingdojo.pokerhands.Player;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ThreeOfAKindDeterminaterTest {

  private final List<String> player1Pokers;
  private final List<String> player2Pokers;
  private final Player expectedResult;

  private static final Player PLAYER_1 = new Player("Player 1");
  private static final Player PLAYER_2 = new Player("Player 2");

  @Parameters(name = "{index}: Given P1 has {0} and P2 has {1}, When I get result, Then I will be able to get {2}")
  public static Collection<Object> data() {
    return Arrays.asList(new Object[][]{
            {Arrays.asList("2S", "3S", "4S", "5S", "7D"), Arrays.asList("2D", "3D", "4D", "5D", "7S"),
                null},
            {Arrays.asList("2S", "2H", "2D", "5S", "7D"), Arrays.asList("3D", "3H", "4D", "5D", "7S"),
                PLAYER_1},
            {Arrays.asList("3S", "2H", "4D", "5S", "7D"), Arrays.asList("3D", "3H", "3C", "5D", "7S"),
                PLAYER_2},
            {Arrays.asList("2S", "2H", "2D", "5S", "7D"), Arrays.asList("3D", "3H", "3C", "5D", "7S"),
                PLAYER_2}
        }

    );
  }

  public ThreeOfAKindDeterminaterTest(final List<String> player1Pokers, final List<String> player2Pokers,
      final Player expectedResult) {
    this.player1Pokers = player1Pokers;
    this.player2Pokers = player2Pokers;
    this.expectedResult = expectedResult;
    PLAYER_1.clearPokers();
    PLAYER_2.clearPokers();
    this.PLAYER_1.collectPokers(player1Pokers);
    this.PLAYER_2.collectPokers(player2Pokers);
  }

  @Test
  public void getWinner() {
    Player actualWinner = new ThreeOfAKindDeterminater().getWinner(PLAYER_1, PLAYER_2);
    assertEquals(expectedResult, actualWinner);
  }
}