package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static final int LIMIT = 100;

    public static void game() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var number = Utils.generateNumber(1, LIMIT);
        var correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
