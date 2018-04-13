package codingdojo.pokerhands;

import java.util.HashMap;
import java.util.Map;

public class Poker {
    private Integer faceValue;

    public Poker(String cardFace) {
        faceValue = convertFaceValue(cardFace.substring(0,1));
    }

    public Integer getFaceValue() {
        return faceValue;
    }

    private Integer convertFaceValue(String cardFaceValueString) {
        Map<String, Integer> faceValueMap = new HashMap<>();
        faceValueMap.put("T", 10);
        faceValueMap.put("J", 11);
        faceValueMap.put("Q", 12);
        faceValueMap.put("K", 13);
        faceValueMap.put("A", 14);
        if (faceValueMap.containsKey(cardFaceValueString)) {
            return faceValueMap.get(cardFaceValueString);
        }
        return Integer.valueOf(cardFaceValueString);
    }
}
