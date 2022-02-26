package KatasDavina;

public class BowlingGame {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;

        for( int frame = 0; frame<10; frame++) {

            if (rolls[frameIndex] == 10){ //isStrike
                score += 10 + rolls[frameIndex +1] + rolls[frameIndex + 2]; //strike bonus
                frameIndex++;
            }else if (rolls[frameIndex] + rolls[frameIndex + 1] == 10) {  // isSpare
                score += 10 + rolls[frameIndex + 2]; //spareBonus
                frameIndex += 2;
            } else {
                score += rolls[frameIndex] + rolls[frameIndex + 1]; //sumOfBallsInFrame
                frameIndex += 2;
                }
            }

        return  score;
        }
}
