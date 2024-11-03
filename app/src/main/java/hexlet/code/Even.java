package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int counterCorreect = 0;
        //запускаем 3 попытки
        for (int i = 0; i < 3; i++) {
            //запрошиваем число и ответ игрока
            System.out.print("Question: ");
            int number = (int) (Math.random() * 100);
            System.out.println(number);

            System.out.print("Your answer: ");
            Scanner answerUser = new Scanner(System.in);
            String evenNumber = answerUser.next();
            System.out.println(evenNumber);

            boolean checkEven;
            //проверка четности
            if (number % 2 == 0) {
                checkEven = true;
            } else {
                checkEven = false;
            }
            System.out.println("even = " + checkEven);
            System.out.println("answer = " +evenNumber);
            //проверка корректности
            if (evenNumber.equals("yes") && checkEven == true) {
                System.out.println("Correct!");
                counterCorreect++;
            } else if ((evenNumber.equals("yes") && checkEven == false) || (!evenNumber.equals("no"))) {
                System.out.println("'" + evenNumber + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.getUserName());
            }
            if (evenNumber.equals("no") && checkEven == false) {
                System.out.println("Correct!");
                counterCorreect++;
            } else if (evenNumber.equals("no") && checkEven == true || (!evenNumber.equals("yes"))) {
                System.out.println("'" + evenNumber + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.getUserName());
            }
        }
        //вывод поздравления
        if (counterCorreect == 3) {
            System.out.println("Congratulations,  " + Cli.getUserName() + "!");
        }
    }
}
