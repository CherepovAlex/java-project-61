package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static final int LIMIT = 100;

    public static void game() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var number = Utils.generateNumber(1, LIMIT);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        if (number != 1) {
            return number % 2 == 0;
        } else {
            return false;
        }
    }
}
