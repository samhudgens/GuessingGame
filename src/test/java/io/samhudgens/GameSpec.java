package io.samhudgens;

import static org.junit.Assert.*;
import org.junit.Test;


////Testing Class

public class GameSpec {

    @Test
    public void ifGuessEqualsLastGuessTest() {
        GuessGame guessGame = new GuessGame();
        guessGame.lastGuess = 4;
        guessGame.guess = 4;
        boolean actual = guessGame.ifGuessEqualsLastGuess();
        assertTrue("should show true", actual);
    }

    @Test
    public void checkIfGuessIsEqualTest() {
        GuessGame guessGame = new GuessGame();
        guessGame.secretNumber = 32;
        guessGame.guess = 32;
        boolean actual = guessGame.checkIfGuessIsEqual();
        assertTrue("should show true", actual);
    }

    @Test
    public void checkIfGuessTooLargeTest() {
        GuessGame guessGame = new GuessGame();
        guessGame.secretNumber = 32;
        guessGame.guess = 35;
        String expected = "your guess was too high, try a lower number";
        String actual = guessGame.checkIfGuessTooLarge();
        assertEquals("should print correct string", expected, actual);
    }

    @Test
    public void checkIfGuessTooSmallTest() {
        GuessGame guessGame = new GuessGame();
        guessGame.secretNumber = 32;
        guessGame.guess = 19;
        String expected = "your guess was too low, try a higher number";
        String actual = guessGame.checkIfGuessTooSmall();
        assertEquals("should print correct string", expected, actual);
    }
}
