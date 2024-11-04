package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void gameEven() {
        //задавание вопроса
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        //массив пар вопрос и ответ
        var questions = new String[3][];
        for (int i = 0; i < 3; i++) {
            //формируем пару вопрос и ответ
            questions[i] = generateRound();
        }
        //запускаем вопросы
        Engine.run(questions, "Правила игры");
    }

    //генерация одного раунда
    private static String[] generateRound() {
        //генерируем число
        var number = new Random().nextInt(1, 100);
        //проверка четности
        var correctAnswer = isEven(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    //утилитарный метод - проверка на четность
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
