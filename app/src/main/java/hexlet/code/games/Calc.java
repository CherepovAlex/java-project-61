package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final int NUMBER_LIMIT = 100;
    private static final char[] MATH_SIGNS = {'+', '-', '*'};

    public static void run() {
        int mathOperation = MATH_SIGNS.length;
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            char sign = (char) Utils.generateNumber(0, mathOperation);
            questions[i] = generateRound(MATH_SIGNS[sign]);
        }
        Engine.run(questions, "What is the result of the expression?");
    }

    private static String[] generateRound(char mathSign) {
        var result = 0;
        var firstNumber = Utils.generateNumber(1, NUMBER_LIMIT);
        var secondNumber = Utils.generateNumber(1, NUMBER_LIMIT);
        result = calculate(firstNumber, secondNumber, mathSign);
        String question = firstNumber + " " + mathSign + " " + secondNumber;
        return new String[]{question, Integer.toString(result)};
    }

    public static int calculate(int firstNumber, int secondNumber, char mathSign) {
        return switch (mathSign) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new RuntimeException("unknown operation");
        };
    }
}
