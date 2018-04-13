package codingdojo.pokerhands;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Player {
    private final String name;
    private List<Poker> pokers;

    public Player(String name) {
        this.name = name;
        this.pokers = new ArrayList<>();
    }

    public void collectPokers(String... pokerValues) {
        this.pokers.addAll(Stream.of(pokerValues).map(Poker::new).collect(Collectors.toList()));
    }

    public List<Poker> getPokers() {
        return pokers;
    }

    public String getName() {
        return name;
    }

    public Poker getHighestPoker() {
        return pokers.stream()
                .max(Comparator.comparing(Poker::getFaceValue))
                .orElse(null);
    }
}
