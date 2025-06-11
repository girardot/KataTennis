package miditech.kata.tennis;

import java.util.Map;

public class TennisGame implements TennisGameInterface {


	private final String playerOneName;
	private final String playerTwoName;

	private int scorePlayerOne = 0;
	private int scorePlayerTwo = 0;

	public TennisGame(String playerOneName, String playerTwoName) {
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
	}

	@Override
	public String getScore() {

		if (hasWinner()) {
			return playerWithHighestScore() + " wins";
		}

		if (hasAdvantage()) {
			return "Advantage " + playerWithHighestScore();
		}

		if (isDeuce()) {
			return "Deuce";
		}

		if (scorePlayerOne == scorePlayerTwo) {
			return translateScore(scorePlayerOne) + " all";
		}

		return translateScore(scorePlayerOne) + "," + translateScore(scorePlayerTwo);
	}

	private boolean hasWinner() {
		if (scorePlayerTwo >= 4 && scorePlayerTwo >= scorePlayerOne + 2) {
			return true;
		}
		if (scorePlayerOne >= 4 && scorePlayerOne >= scorePlayerTwo + 2) {
			return true;
		}
		return false;
	}

	private boolean hasAdvantage() {
		if (scorePlayerTwo >= 4 && scorePlayerTwo == scorePlayerOne + 1) {
			return true;
		}
		if (scorePlayerOne >= 4 && scorePlayerOne == scorePlayerTwo + 1) {
			return true;
		}
		return false;
	}

	private String playerWithHighestScore() {
		if (scorePlayerOne > scorePlayerTwo) {
			return playerOneName;
		} else {
			return playerTwoName;
		}
	}

	private boolean isDeuce() {
		return scorePlayerOne >= 3 && scorePlayerTwo == scorePlayerOne;
	}

	@Override
	public void playerOneScores() {
		scorePlayerOne++;
	}

	@Override
	public void playerTwoScores() {
		scorePlayerTwo++;
	}

	private final Map<Integer, String> scoreLabels = Map.of(
			0, "Love",
			1, "Fifteen",
			2, "Thirty",
			3, "Forty"
	);

	private String translateScore(int score) {
		return scoreLabels.get(score);
	}
}
