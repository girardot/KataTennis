package miditech.kata.tennis;

public class TennisGame implements TennisGameInterface {

	private String score = "";

	public TennisGame(String playerOneName, String playerTwoName) {
	}

	@Override
	public String getScore() {
		return score;
	}

	@Override
	public void playerOneScores() {
		score = "Fifteen,Love";
	}

	@Override
	public void playerTwoScores() {
		score = "Love,Fifteen";
	}

}
