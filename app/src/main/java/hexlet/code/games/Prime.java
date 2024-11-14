package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final int NUMBER_LIMIT = 100;

    public static void run() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var numberQuestion = Utils.generateNumber(1, NUMBER_LIMIT);
        var correctAnswer = isPrime(numberQuestion) ? "yes" : "no";
        return new String[]{String.valueOf(numberQuestion), correctAnswer};
    }

    private static boolean isPrime(int numberQuestion) {
        for (int i = 2; i < numberQuestion; i++) {
            if (numberQuestion % i == 0) {
                return false;
            }
        }
        return true;
    }
}
