package com.siq.farkle.scorer;

public class Score {

    private String diceFaces;

    public Score(String diceFaces) {
        this.diceFaces = diceFaces;
    }

    public int calculate() {
        int accumulatedScore = 0;
        if (hasStraight() != 0) {
            accumulatedScore += hasStraight();
        }
        return accumulatedScore;
    }

    private int hasStraight() {
        int returnScore = 0;
        if (diceFaces.contains("1") && diceFaces.contains("2") &&
                diceFaces.contains("3") && diceFaces.contains("4") &&
                diceFaces.contains("5") && diceFaces.contains("6")
                ) returnScore = 1200;
        return returnScore;
    }

}
