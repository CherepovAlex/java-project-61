package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static final int LIMIT1 = 100;
    public static final int LIMIT2 = 10;
    public static final int LENGHT = 10;

    public static void game() {
        System.out.println("What number is missing in the progression?");
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions);
    }

    private static String[] generateRound() {

        int count = LENGHT;
        var stepProgr = new Random().nextInt(1, LIMIT2);
        var startProrg = new Random().nextInt(1, LIMIT1);
        var hidIndex = new Random().nextInt(1, LIMIT2);

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
