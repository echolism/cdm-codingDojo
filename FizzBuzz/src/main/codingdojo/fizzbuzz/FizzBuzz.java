package codingdojo.fizzbuzz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FizzBuzz {

  public static String getFizzBuzz(int input) {

    Map<Integer, String> div = new LinkedHashMap<>();
    div.put(3, "Fizz");
    div.put(5, "Buzz");
    div.put(7, "Whizz");

    String output = div.entrySet().stream()
        .filter(entry -> input % entry.getKey() == 0)
        .map(Entry::getValue).collect(Collectors.joining(""));

    return output.isEmpty() ? String.valueOf(input) : output;
  }
}
