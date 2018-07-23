package codingdojo.pokerhands;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PokerHandsTest {

  private final List<String> player1Pokers;
  private final List<String> player2Pokers;
  private final String expectedResult;

  public PokerHandsTest(final List<String> player1Pokers, final List<String> player2Pokers,
      final String expectedResult) {
    this.player1Pokers = player1Pokers;
    this.player2Pokers = player2Pokers;
    this.expectedResult = expectedResult;
  }

  @Parameters(name = "{index}: Given P1 has {0} and P2 has {1}, When I get result, Then I will be able to get {2}")
  public static Collection<Object> data() {
    return Arrays.asList(new Object[][]{
        {Arrays.asList("2S", "3S", "4S", "5S", "7D"), Arrays.asList("2D", "3D", "4D", "5D", "7S"),
            PokerHands.DRAW_GAME_MSG},
        {Arrays.asList("2S", "3S", "4S", "5S", "8D"), Arrays.asList("2D", "3D", "4D", "5D", "7S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("2S", "3S", "4S", "5S", "7D"), Arrays.asList("2D", "3D", "4D", "5D", "8S"),
            PokerHands.PLAYER_2_WIN_MSG},
        {Arrays.asList("2S", "3S", "4S", "5S", "TD"), Arrays.asList("2D", "3D", "4D", "5D", "8S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("2S", "3S", "4S", "5S", "JD"), Arrays.asList("2D", "3D", "4D", "5D", "8S"),
            PokerHands.PLAYER_1_WIN_MSG},

        {Arrays.asList("2S", "3S", "4S", "5S", "QD"), Arrays.asList("2D", "3D", "4D", "5D", "8S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("2S", "3S", "4S", "5S", "AD"), Arrays.asList("2D", "3D", "4D", "5D", "8S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("2S", "3S", "4S", "AD", "5S"), Arrays.asList("2D", "3D", "4D", "5D", "8S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("5S", "4S", "3S", "8D", "2S"), Arrays.asList("8S", "5D", "4D", "3D", "2D"),
            PokerHands.DRAW_GAME_MSG},
        {Arrays.asList("5S", "4S", "3S", "8D", "2S"), Arrays.asList("8S", "6D", "4D", "3D", "2D"),
            PokerHands.PLAYER_2_WIN_MSG},

        {Arrays.asList("5S", "4S", "3S", "9D", "8S"), Arrays.asList("9S", "8D", "4D", "5D", "2D"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("2S", "2D", "3S", "4S", "5S"), Arrays.asList("4D", "5D", "6D", "7D", "9S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("4D", "5D", "6D", "7D", "9S"), Arrays.asList("2S", "2D", "3S", "4S", "5S"),
            PokerHands.PLAYER_2_WIN_MSG},
        {Arrays.asList("4D", "5D", "6D", "7D", "9S"), Arrays.asList("2S", "3S", "4S", "5S", "2D"),
            PokerHands.PLAYER_2_WIN_MSG},
        {Arrays.asList("4D", "4H", "6D", "7D", "9S"), Arrays.asList("2S", "3S", "4S", "5S", "2D"),
            PokerHands.PLAYER_1_WIN_MSG},

        {Arrays.asList("4D", "4H", "6D", "7D", "9S"), Arrays.asList("4S", "6S", "4C", "7S", "9D"),
            PokerHands.DRAW_GAME_MSG},
        {Arrays.asList("4D", "4H", "6D", "7D", "9S"), Arrays.asList("4S", "6S", "4C", "7S", "8D"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("4S", "6S", "4C", "7S", "8D"), Arrays.asList("4D", "4H", "6D", "7D", "9S"),
            PokerHands.PLAYER_2_WIN_MSG},
        {Arrays.asList("4S", "3S", "4C", "7S", "3D"), Arrays.asList("4D", "4H", "6D", "7D", "9S"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("4D", "4H", "6D", "7D", "9S"), Arrays.asList("4S", "3S", "4C", "7S", "3D"),
            PokerHands.PLAYER_2_WIN_MSG},

        {Arrays.asList("4D", "4H", "8S", "8D", "9S"), Arrays.asList("4S", "4C", "7C", "7S", "3D"),
            PokerHands.PLAYER_1_WIN_MSG},
        {Arrays.asList("4D", "4H", "6S", "6D", "9S"), Arrays.asList("4S", "4C", "7C", "7S", "3D"),
            PokerHands.PLAYER_2_WIN_MSG},
        {Arrays.asList("3D", "3H", "7H", "7D", "9S"), Arrays.asList("4S", "4C", "7C", "7S", "2D"),
            PokerHands.PLAYER_2_WIN_MSG},
        {Arrays.asList("3D", "3H", "7H", "7D", "9S"), Arrays.asList("3S", "3C", "7C", "7S", "9D"),
            PokerHands.DRAW_GAME_MSG},
        {Arrays.asList("3D", "3H", "7H", "7D", "8S"), Arrays.asList("3S", "3C", "7C", "7S", "9D"),
            PokerHands.PLAYER_2_WIN_MSG},

        // Three Cards
        {Arrays.asList("3D", "3H", "3C", "7D", "9H"), Arrays.asList("3S", "4S", "4H", "9S", "9D"),
            PokerHands.PLAYER_1_WIN_MSG}
    });
  }

  @Test
  public void assertPokerHands() {
    final Player player1 = new Player("Player 1");
    player1.collectPokers(player1Pokers);
    final Player player2 = new Player("Player 2");
    player2.collectPokers(player2Pokers);

    final String result = new PokerHands().determine(player1, player2);

    assertEquals(expectedResult, result);
  }
}
