package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String[][] rounds) {

        for (String[] round : rounds) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String answerUser = scanner.next();
            if (answerUser.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerUser + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + round[1] + "'");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");

    }
}

