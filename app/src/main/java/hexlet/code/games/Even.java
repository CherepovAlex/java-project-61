package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions);
    }

    private static String[] generateRound() {
        var number = new Random().nextInt(1, 100);
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
