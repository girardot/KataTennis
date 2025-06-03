package miditech.kata.tennis;

import java.util.Map;

public class TennisGame implements TennisGameInterface {


	private final Map<Integer, String> scoreLabels = Map.of(
			0, "Love",
			1, "Fifteen",
			2, "Thirty",
			3, "Forty"
	);

	private int scorePlayerOne = 0;
	private int scorePlayerTwo = 0;

	public TennisGame(String playerOneName, String playerTwoName) {
	}

	@Override
	public String getScore() {
		if (scorePlayerOne == scorePlayerTwo) {
			if (scorePlayerOne <= 3) {
				return scoreLabels.get(scorePlayerOne) + " all";
			} else {
				return "Deuce";
			}
		}
		return scoreLabels.get(scorePlayerOne) + "," + scoreLabels.get(scorePlayerTwo);
	}

	@Override
	public void playerOneScores() {
		scorePlayerOne++;
	}

	@Override
	public void playerTwoScores() {
		scorePlayerTwo++;
	}

}
