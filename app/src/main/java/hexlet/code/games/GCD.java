package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final int NUMBER_LIMIT = 100;

    public static void run() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Find the greatest common divisor of given numbers.");
    }

    private static String[] generateRound() {
        var firstNumber = Utils.generateNumber(1, NUMBER_LIMIT);
        var secondNumber = Utils.generateNumber(1, NUMBER_LIMIT);
        var correctAnswer = gcd(firstNumber, secondNumber);
        return new String[]{firstNumber + " " + secondNumber, String.valueOf(correctAnswer)};
    }

    private static int gcd(int number1, int number2) {
        int min = Math.min(number1, number2);
        for (int i = min; i >= 1; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                return i;
            }
        }
        return 1;
    }
}
