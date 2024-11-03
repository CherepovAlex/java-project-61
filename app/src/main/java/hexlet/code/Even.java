package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int counterCorreect = 0;
        //запускаем 3 попытки
        for (int i = 0; i < 3; i++) {
            //запрашиваем число и ответ игрока
            System.out.print("Question: ");
            int number = (int) (Math.random() * 100);
            System.out.println(number);

            System.out.print("Your answer: ");
            Scanner answerUser = new Scanner(System.in);
            String evenNumber = answerUser.next();
//            System.out.println(evenNumber);

            //проверка четности
            boolean b = false;
            boolean checkEven = (number % 2 == 0) ? (b = true) : b;

            //проверка корректности
            if (checkEven == true) {
                if (evenNumber.equals("yes")) {
                    System.out.println("Correct!");
                    counterCorreect++;
                } else if (evenNumber.equals("no") || (!evenNumber.equals("no"))) {
                    System.out.println("'" + evenNumber + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Cli.getUserName());
                }
            }
            if (checkEven == false) {
                if (evenNumber.equals("no")) {
                    System.out.println("Correct!");
                    counterCorreect++;
                } else if (evenNumber.equals("yes") || (!evenNumber.equals("yes"))) {
                    System.out.println("'" + evenNumber + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Cli.getUserName());
                }
            }
            //вывод поздравления

        }
        if (counterCorreect == 3) {
            System.out.println("Congratulations,  " + Cli.getUserName() + "!");
        }
    }
}
