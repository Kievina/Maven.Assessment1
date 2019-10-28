package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningMove = "";
        switch (handSign) {
            case "rock":
                winningMove = "paper";
                break;
            case "paper":
                winningMove = "scissor";
                break;
            case "scissor":
                winningMove = "rock";
                break;
            default:
                break;
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        switch (handSign) {
            case "rock":
                losingMove = "scissor";
                break;
            case "paper":
                losingMove = "rock";
                break;
            case "scissor":
                losingMove = "paper";
                break;
            default:
                break;
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (handSignOfPlayer1.equals(getWinningMove(handSignOfPlayer2)))
            winner = handSignOfPlayer1;
        if (handSignOfPlayer1.equals(getLosingMove(handSignOfPlayer2)))
            winner = handSignOfPlayer2;
        return winner;
    }
}
