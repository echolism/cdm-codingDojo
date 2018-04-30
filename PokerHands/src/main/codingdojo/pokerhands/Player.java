package codingdojo.pokerhands;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Player {
    private final String name;
    private List<Poker> pokers;

    public Player(String name) {
        this.name = name;
        this.pokers = new ArrayList<>();
    }

    public void collectPokers(String... pokerValues) {
        this.pokers.addAll(Stream.of(pokerValues)
                .map(Poker::new)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }

    public String getName() {
        return name;
    }

    public Poker getHighestPoker() {
        return pokers.get(0);
    }

    public boolean hasPair() {
        return getPair() != null;
    }

    private Poker getPair() {
        for (int i = 0; i < 4; i++) {
            if (pokers.get(i).compareTo(pokers.get(i + 1)) == 0) {
                return pokers.get(i);
            }
        }
        return null;
    }
}
