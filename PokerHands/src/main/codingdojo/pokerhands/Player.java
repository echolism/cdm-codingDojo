package codingdojo.pokerhands;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Player {

  private final String name;
  private List<Poker> pokers;

  public Player(String name) {
    this.name = name;
    this.pokers = new ArrayList<>();
  }

  public void collectPokers(final List<String> pokerValues) {
    this.pokers.addAll(pokerValues.stream()
        .map(Poker::new)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList()));
  }

  public String getName() {
    return name;
  }

  public Poker getHighestPoker(int ranking) {
    return pokers.get(ranking);
  }

  public boolean hasPair() {
    return getPair() != null;
  }

  public Poker getPair() {
    for (int i = 0; i < 4; i++) {
      if (pokers.get(i).compareTo(pokers.get(i + 1)) == 0) {
        return pokers.get(i);
      }
    }
    return null;
  }

  public boolean hasTwoPairs() {
    return getAllPairs().size() == 2;
  }

  public List<Poker> getAllPairs() {
    List<Poker> pairs = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      if (pokers.get(i).compareTo(pokers.get(i + 1)) == 0) {
        pairs.add(pokers.get(i));
      }
    }
    return pairs;
  }

  public boolean hasThreeOfAKind() {
    return pokers.get(2).compareTo(pokers.get(3)) == 0 && pokers.get(3).compareTo(pokers.get(4)) == 0;
//    int sameCardCount = 0;
//    for (int i = 0; i < 4; i++) {
//      if (pokers.get(i).compareTo(pokers.get(i + 1)) == 0) {
//        sameCardCount++;
//      } else {
//        sameCardCount = 0;
//      }
//    }
//    return sameCardCount == 3;
  }
}
