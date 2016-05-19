package io.samhudgens;

/**
 * Created by samhudgens on 4/29/16.
 */
public class GuessGame {

    public int guess;
    public int guessCount = 0;
    public int secretNumber = 34;
    public int lastGuess;
    public boolean correct = false;



    public void checkTheGuess() {
        if (ifGuessEqualsLastGuess()) {
            return;
        }
        checkIfGuessTooSmall();
        checkIfGuessTooLarge();
        checkIfGuessIsEqual();
    }

    public boolean checkIfGuessIsEqual() {
        if(guess == secretNumber){
            guessCount++;
            correct = true;
            return true;
        } else {
            return false;
        }
    }

    public String checkIfGuessTooLarge() {
        String s = "";
        if(guess > secretNumber) {
            System.out.println("your guess was too high, try a lower number");
            guessCount++;
            lastGuess = guess;
            s = "your guess was too high, try a lower number";
        }
        return s;
        }


    public String checkIfGuessTooSmall() {
        String s = "";
        if (guess < secretNumber) {
            System.out.println("your guess was too low, try a higher number");
            guessCount++;
            lastGuess = guess;
            s = "your guess was too low, try a higher number";
        }
        return s;
    }

    public boolean ifGuessEqualsLastGuess() {
        if (lastGuess == guess) {
            return true;
        }

        return false;
    }


}
