package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int LIMIT1 = 100;
    public static final int LIMIT2 = 10;
    public static final int LENGHT = 10;

    public static void game() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What number is missing in the progression?");
    }

    private static String[] generateRound() {

        var stepProgr = Utils.generateNumber(1, LIMIT2);
        var startProrg = Utils.generateNumber(1, LIMIT1);
        var hidIndex = Utils.generateNumber(1, LIMIT2);

        String[] progression = generateProgression(startProrg, stepProgr);
        var answer = progression[hidIndex];
        progression[hidIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, String.valueOf(answer)};
    }

    private static String[] generateProgression(int startProrgression, int stepProgression) {
        int[] progr = new int[LENGHT];
        progr[0] = startProrgression;
        String[] progr1 = new String[LENGHT];
        for (int i = 1; i < LENGHT; i++) {
            progr[i] = progr[i - 1] + stepProgression;
        }
        for (int i = 0; i < LENGHT; i++) {
            progr1[i] = String.valueOf(progr[i]);
        }
        return progr1;
    }

}
