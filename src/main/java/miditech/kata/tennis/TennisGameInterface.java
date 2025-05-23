package miditech.kata.tennis;

public interface TennisGameInterface {
	String getScore() throws NotYetImplementedException;

	void playerOneScores() throws Exception;

	void playerTwoScores() throws Exception;
}
