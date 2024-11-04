package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    public static void game() {
        //задавание вопроса
        System.out.println("Find the greatest common divisor of given numbers.");
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
        //генерируем число
        var number1 = new Random().nextInt(1, 100);
        var number2 = new Random().nextInt(1, 100);
        //поиск НОД
        var correctAnswer = gcd(number1, number2);
        return new String[]{number1 + " " + number2, String.valueOf(correctAnswer)};
    }

    //утилитарный метод - проверка на четность
    private static int gcd(int number1, int number2) {
        int min = Math.min(number1, number2);
        for (int i = min - 1; i >= 1 ; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                return i;
            }
        }
        return 1;
    }
}
