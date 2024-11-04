package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void gameMath() {
        //задавание вопроса
        System.out.println("What is the result of the expression?");
        //массив пар вопрос и ответ
        var questions = new String[3][];
        for (int i = 0; i < 3; i++) {
            //формируем пару вопрос и ответ
            questions[i] = generateRound(i);
        }
        //запускаем вопросы
        Engine.run(questions, "Правила игры");
    }

    //генерация одного раунда
    private static String[] generateRound(int i) {
        var number = 0;
        String question = "";
        //генерируем числа
        var number1 = new Random().nextInt(1, 100);
        var number2 = new Random().nextInt(1, 100);
        //генерируем операции
        if (i == 0) {
            number = number1 + number2;
            question = question + number1 + " + " + number2;
        }
        if (i == 1) {
            number = number1 - number2;
            question = question + number1 + " - " + number2;
        }
        if (i == 2) {
            number = number1 * number2;
            question = question + number1 + " * " + number2;
        }
        String correctAnswer = Integer.toString(number);
        return new String[]{question, correctAnswer};
    }
}

