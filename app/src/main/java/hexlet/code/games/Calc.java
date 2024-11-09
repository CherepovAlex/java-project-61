package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static final int LIMIT = 100;
    private static final char[] SIGNS = {'+', '-', '*'};
    ;

    public static void game() {
        int capOperations = SIGNS.length;
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            char sign = (char) Utils.generateNumber(1, capOperations);
            questions[i] = generateRound(SIGNS[sign]);
        }
        Engine.run(questions, "What is the result of the expression?");
    }

    private static String[] generateRound(char sign) {
        var number = 0;
        var number1 = Utils.generateNumber(1, LIMIT);
        var number2 = Utils.generateNumber(1, LIMIT);
        number = calculate(number1, number2, sign);
        String question = number1 + " " + sign + " " + number2;
        return new String[]{question, Integer.toString(number)};
    }

    public static int calculate(int number1, int number2, char symbol) {
        return switch (symbol) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("unknown operation");
        };
    }
}

class Utils {
    public static int generateNumber(int startNumber, int endNumber) {
        return new Random().nextInt(startNumber, endNumber);
    }

}

