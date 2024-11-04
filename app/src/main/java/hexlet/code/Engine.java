package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(String[][] rounds, String rules) {

        int counterCorrect = 0;

        for (String[] round : rounds) {
            //Scanner scanner = new Scanner(System.in);
            //запрашиваем вопрос
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answerUser = scanner.next();

            //выводим ответ
            if (answerUser.equals(round[1])) {
                System.out.println("Correct!");
                counterCorrect++;
            } else {
                System.out.println("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was" + "'" + round[1] + "'");
                System.out.println("Let's try again, " + Cli.getUserName());
            }
        }

        //вывод поздравления
        if (counterCorrect == 3) {
            System.out.println("Congratulations,  " + Cli.getUserName() + "!");
        }

    }
}
