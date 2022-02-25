package KatasDavina;

public class BowlingGame {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public Object score() {
        return score;
    }
}
