package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    public static void game() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Правила игры");
    }

    private static String[] generateRound() {
        var number = new Random().nextInt(1, 100);
        var correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) ;
            return false;
        }
        return true;
    }
}
