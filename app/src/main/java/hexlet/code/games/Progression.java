package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static void game() {
        System.out.println("What number is missing in the progression?");
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "Правила игры");
    }

    private static String[] generateRound() {

        int count = 10;
        var stepProgr = new Random().nextInt(1, 10);
        var startProrg = new Random().nextInt(1, 100);
        var hidIndex = new Random().nextInt(1, 10);

        String[] progression = generateProgression(startProrg, stepProgr, count);
        var answer = progression[hidIndex];
        progression[hidIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, String.valueOf(answer)};
    }

    private static String[] generateProgression(int startProrg, int stepProgr, int count) {
        int[] progr = new int[count];
        progr[0] = startProrg;
        String[] progr1 = new String[count];
        for (int i = 1; i < count; i++) {
            progr[i] = progr[i - 1] + stepProgr;
        }
        for (int i = 0; i < count; i++) {
            progr1[i] = String.valueOf(progr[i]);
        }
        return progr1;
    }

}
