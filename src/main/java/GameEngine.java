package src.main.java;

public class GameEngine {
    private static final int MAX_ATTEMPTS = 10;

    private final int min;
    private final int max;
    private int target;
    private int attempts;
    private boolean gameWon;
    private boolean userQuit;
    private boolean gameOver;

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;
        reset();
    }

    public GuessResult makeGuess(int guess) {
        // User chooses to quit
        if (guess < 0) {
            userQuit = true;
            return new GuessResult(false, "Exiting game...", attempts);
        }

        attempts++;

        // Check max attempts
        if (attempts > MAX_ATTEMPTS) {
            gameOver = true;
            return new GuessResult(false, "Game Over! You've used all " + MAX_ATTEMPTS + " attempts. The number was " + target + ".", attempts);
        }

        // Check guess
        if (guess == target) {
            gameWon = true;
            return new GuessResult(true, "Correct! You guessed it in " + attempts + " attempts.", attempts);
        } else {
            int remaining = MAX_ATTEMPTS - attempts;
            GuessResult result;
            if (guess < target) {
                result = new GuessResult(false, "Too low! Try a higher number.", attempts);
            } else {
                result = new GuessResult(false, "Too high! Try a lower number.", attempts);
            }
            result.setRemainingAttempts(remaining);
            return result;
        }
    }

    public void reset() {
        target = Utils.randomInt(min, max);
        attempts =
