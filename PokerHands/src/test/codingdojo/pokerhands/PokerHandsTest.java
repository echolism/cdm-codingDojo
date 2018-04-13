package codingdojo.pokerhands;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PokerHandsTest {
    /**
     * Given P1 has 2S 3S 4S 5S 7D and P2 has 2D 3D 4D 5D 7S
     * When I get result
     * Then draw game
     */
    @Test
    public void testGivenP1Has2S3S4S5S7DAndP2Has2D3D4D5D7SWhenGetResultThenDrawGame() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "7D");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "7S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.DRAW_GAME_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S 5S 8D and P2 has 2D 3D 4D 5D 7S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5S8DAndP2Has2D3D4D5D7SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "8D");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "7S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S 5S 7D and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 2 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5S7DAndP2Has2D3D4D5D8SWhenGetResultThenP2Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "7D");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_2_WIN_MSG, result);
    }


    /**
     * Given P1 has 2S 3S 4S 5S TD and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5STDAndP2Has2D3D4D5D8SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "TD");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S 5S JD and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5SJDAndP2Has2D3D4D5D8SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "JD");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S 5S QD and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5SQDAndP2Has2D3D4D5D8SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "QD");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S 5S KD and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5SKDAndP2Has2D3D4D5D8SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "KD");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S 5S AD and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4S5SADAndP2Has2D3D4D5D8SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "5S", "AD");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }

    /**
     * Given P1 has 2S 3S 4S AD 5S and P2 has 2D 3D 4D 5D 8S
     * When I get result
     * Then I should get "Player 1 wins."
     */
    @Test
    public void testGivenP1Has2S3S4SAD5SAndP2Has2D3D4D5D8SWhenGetResultThenP1Wins() {
        Player player1 = new Player("Player 1");
        player1.collectPokers("2S", "3S", "4S", "AD", "5S");
        Player player2 = new Player("Player 2");
        player2.collectPokers("2D", "3D", "4D", "5D", "8S");

        String result = new PokerHands().determine(player1, player2);

        assertEquals(PokerHands.PLAYER_1_WIN_MSG, result);
    }
}
