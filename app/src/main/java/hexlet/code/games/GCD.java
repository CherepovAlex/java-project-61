package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    public static final int LIMIT = 100;

    public static void game() {
        System.out.println("Find the greatest common divisor of given numbers.");
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions);
    }

    private static String[] generateRound() {
        var number1 = new Random().nextInt(1, LIMIT);
        var number2 = new Random().nextInt(1, LIMIT);
        var correctAnswer = gcd(number1, number2);
        return new String[]{number1 + " " + number2, String.valueOf(correctAnswer)};
    }

    private static int gcd(int number1, int number2) {
        int min = Math.min(number1, number2);
        for (int i = min - 1; i >= 1; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                return i;
            }
        }
        return 1;
    }
}
