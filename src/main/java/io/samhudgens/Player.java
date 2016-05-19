package io.samhudgens;

import java.util.Scanner;

public class Player {
    public int takeAGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Try and guess the secret number");
        return input.nextInt();
    }
}
