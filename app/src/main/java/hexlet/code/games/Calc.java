package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void game() {
        //задавание вопроса
        System.out.println("What is the result of the expression?");
        //массив пар вопрос и ответ
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            //формируем пару вопрос и ответ
            var sign = new char[]{'+', '-', '*'};
            questions[i] = generateRound(sign[i]);
        }
        //запускаем вопросы
        Engine.run(questions);
    }

    //генерация одного раунда
    private static String[] generateRound(char sign) {
        var number = 0;
        StringBuilder question = new StringBuilder();
        //генерируем числа
        var number1 = new Random().nextInt(1, 100);
        var number2 = new Random().nextInt(1, 100);
        //генерируем операции
        question = new StringBuilder(" ");
        number = calculate(number1, number2, sign);
        question.append(number1).append(" ").append(sign).append(" ").append(number2);
        return new String[]{question.toString(), Integer.toString(number)};
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

