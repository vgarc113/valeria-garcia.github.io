package src.main.java;

import java.util.Scanner;

public class GameUI {
    private final GameEngine engine;
    private final Scanner scanner;

    public GameUI(GameEngine engine) {
        this.engine = engine;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Welcome to the Number Guessing Game! ===");
        System.out.println("Good luck!");

        while (!engine.isGameWon() && !engine.hasUserQuit() && !engine.isGameOver()) {
            System.out.print("Enter your guess: ");
            int guess;
            try {
                guess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            GuessResult result = engine.makeGuess(guess);
            System.out.println(result.getMessage());
            if (result.getRemainingAttempts() > 0) {
                System.out.println("Remaining attempts: " + result.getRemainingAttempts());
            }
        }

        if (engine.isGameWon()) {
            System.out.println("Congratulations! You won the game!");
        } else if (engine.isGameOver()) {
            System.out.println("Game over! Better luck next time.");
        } else if (engine.hasUserQuit()) {
            System.out.println("You quit the game.");
        }
    }
}
