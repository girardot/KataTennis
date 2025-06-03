package miditech.kata.tennis;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

class TennisGameTest {
	private final TennisGame tennisGame = new TennisGame("player1", "player2");

	private static Stream<Arguments> computeScoreParams() {
		return Stream.of(
				of(0, 0, "Love all"),
				of(1, 1, "Fifteen all"),
				of(2, 2, "Thirty all"),
				of(1, 0, "Fifteen,Love"),
				of(2, 0, "Thirty,Love"),
				of(3, 0, "Forty,Love"),
				of(0, 1, "Love,Fifteen"),
				of(0, 2, "Love,Thirty"),
				of(0, 3, "Love,Forty"),
				of(4, 4, "Deuce"),
				of(5, 5, "Deuce"),
				of(6, 6, "Deuce"),
				of(7, 7, "Deuce"),
				of(5, 0, "Advantage Player1"),
				of(5, 1, "Advantage Player1"),
				of(5, 2, "Advantage Player1"),
				of(5, 3, "Advantage Player1"),
				of(5, 4, "Advantage Player1"),
				of(0, 5, "Advantage Player2"),
				of(1, 5, "Advantage Player2"),
				of(2, 5, "Advantage Player2"),
				of(3, 5, "Advantage Player2"),
				of(4, 5, "Advantage Player2")
		);
	}

	@ParameterizedTest
	@MethodSource("computeScoreParams")
	void computeScore(int playerOneScore, int playerTwoScore, String expectedScore) {
		// Given
		for (int i = 0; i < playerOneScore; i++) {
			tennisGame.playerOneScores();
		}
		for (int i = 0; i < playerTwoScore; i++) {
			tennisGame.playerTwoScores();
		}

		// When
		String score = tennisGame.getScore();

		// Then
		assertThat(score).isEqualTo(expectedScore);
	}
}
