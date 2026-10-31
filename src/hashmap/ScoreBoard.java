package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {

    private final Map<String, Integer> scores;

    public ScoreBoard() {
        this.scores = new HashMap<>();
    }

    public int totalScore() {
        if (scores.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (int score : scores.values()) {
             total += score;
        }

        return total;
    }
}