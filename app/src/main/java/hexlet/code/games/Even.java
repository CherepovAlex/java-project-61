package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int NUMBER_LIMIT = 100;

    public static void run() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static String[] generateRound() {
        var numberQuestion = Utils.generateNumber(1, NUMBER_LIMIT);
        var correctAnswer = isEven(numberQuestion) ? "yes" : "no";
        return new String[]{String.valueOf(numberQuestion), correctAnswer};
    }

    private static boolean isEven(int numberQuestion) {
        return numberQuestion % 2 == 0;
    }
}
