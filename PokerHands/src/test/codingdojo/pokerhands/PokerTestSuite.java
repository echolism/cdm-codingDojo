package codingdojo.pokerhands;

import codingdojo.pokerhands.winning.ThreeOfAKindDeterminaterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    PokerHandsTest.class,
    ThreeOfAKindDeterminaterTest.class
})
public class PokerTestSuite {

}
