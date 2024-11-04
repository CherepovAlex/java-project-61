package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String userName;

    public Cli(String userName) {
        this.userName = userName;
    }

    public static void setUserName(String userName) {
        Cli.userName = userName;
    }

    public static void helloMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName(new String(scanner.next()));
        System.out.println("Hello, " + Cli.getUserName());
    }

    public static String getUserName() {
        return userName;
    }

}
