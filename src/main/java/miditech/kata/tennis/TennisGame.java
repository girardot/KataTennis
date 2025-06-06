package miditech.kata.tennis;

import java.util.Map;

public class TennisGame implements TennisGameInterface {


	private final Map<Integer, String> scoreLabels = Map.of(
			0, "Love",
			1, "Fifteen",
			2, "Thirty",
			3, "Forty"
	);
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

		if (scorePlayerOne == scorePlayerTwo) {
			if (scorePlayerOne <= 3) {
				return scoreLabels.get(scorePlayerOne) + " all";
			}

			if (scorePlayerOne == scorePlayerTwo) {
				return "Deuce";
			}
		}

		if (scorePlayerOne <= 3 && scorePlayerTwo <= 3) {
			return scoreLabels.get(scorePlayerOne) + "," + scoreLabels.get(scorePlayerTwo);
		}

		if (scorePlayerOne == 4) {
			if (scorePlayerOne - scorePlayerTwo >= 1) {
				return "Advantage " + playerOneName;
			}
		}

		if (scorePlayerTwo == 4) {
			if (scorePlayerTwo - scorePlayerOne >= 1) {
				return "Advantage " + playerTwoName;
			}
		}

		if (scorePlayerOne > 4) {
			if (scorePlayerOne - scorePlayerTwo == 1) {
				return "Advantage " + playerOneName;
			}

			if (scorePlayerOne - scorePlayerTwo >= 2) {
				return playerOneName + " wins";
			}
		}

		if (scorePlayerTwo > 4) {
			if (scorePlayerTwo - scorePlayerOne == 1) {
				return "Advantage " + playerTwoName;
			}
			if (scorePlayerTwo - scorePlayerOne >= 2) {
				return playerTwoName + " wins";
			}
		}

		return "";
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
