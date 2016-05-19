package io.samhudgens;

/**
 * Created by samhudgens on 4/29/16.
 */
public class App {

    public static void main(String[] args) {


        Player player = new Player();
        GuessGame guess = new GuessGame();

        while (!guess.correct) {
            guess.guess = player.takeAGuess();
            guess.checkTheGuess();

        }
        System.out.println("Correct!");
        System.out.println("It only took you " + guess.guessCount + " guesses!");
    }
}
