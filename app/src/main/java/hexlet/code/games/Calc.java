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
            questions[i] = generateRound();
        }
        //запускаем вопросы
        Engine.run(questions, "Правила игры");
    }

    //генерация одного раунда
    private static String[] generateRound() {
        var number = 0;
        String question = "";
        //генерируем числа
        var number1 = new Random().nextInt(1, 100);
        var number2 = new Random().nextInt(1, 100);
        //генерируем операции
        var sign = new char[]{'+', '-', '*'};
        for (int i = 0; i < Engine.ROUNDS; i++) {
            number = calculate(number1, number2, sign[i]);
            question += number1 + " " + sign[i] + " " + number2;
        }
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

