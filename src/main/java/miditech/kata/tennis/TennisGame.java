package miditech.kata.tennis;

import java.util.List;

public class TennisGame implements TennisGameInterface {

	private final List<Score> scores = List.of(
			Score.LOVE, Score.FIFTEEN, Score.THIRTY, Score.FORTY
	);

	enum Score {
		LOVE("Love", 0),
		FIFTEEN("Fifteen", 1),
		THIRTY("Thirty", 2),
		FORTY("Forty", 3);

		private final String label;
		private final int value;

		Score(final String label, final int value) {
			this.label = label;
			this.value = value;
		}
	}

	private Score scorePlayerOne = Score.LOVE;
	private Score scorePlayerTwo = Score.LOVE;

	public TennisGame(String playerOneName, String playerTwoName) {
	}

	@Override
	public String getScore() {
		return scorePlayerOne.label + "," + scorePlayerTwo.label;
	}

	@Override
	public void playerOneScores() {
		scorePlayerOne = scores.get(scorePlayerOne.value + 1);
	}

	@Override
	public void playerTwoScores() {
		scorePlayerTwo = scores.get(scorePlayerOne.value + 1);
	}

}
