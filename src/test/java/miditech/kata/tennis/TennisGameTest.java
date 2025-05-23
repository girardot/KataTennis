package miditech.kata.tennis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TennisGameTest {

	@Test
	void playerOneScores() throws Exception {
		// Given
		TennisGame tennisGame = new TennisGame("player1", "player2");

		// When
		tennisGame.playerOneScores();

		// Then
		assertThat(tennisGame.getScore()).isEqualTo("Fifteen,Love");
	}

}
