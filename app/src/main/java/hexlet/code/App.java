package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choiceGame = game.nextInt();
        System.out.println();
        Cli.helloMethod();
        switch (choiceGame) {
            case 1:
                Cli.helloMethod();
                break;
            case 0:
                break;
            case 2:
                Even.gameEven();
                break;
            case 3:
                Calc.gameMath();
                break;
            default:
                break;
        }
    }
}
