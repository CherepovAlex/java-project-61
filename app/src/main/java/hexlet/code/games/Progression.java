package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final int LIMIT1 = 100;
    public static final int LIMIT2 = 10;
    public static final int CAPACITY = 10;

    public static void game() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What number is missing in the progression?");
    }

    private static String[] generateRound() {

        var stepProgression = Utils.generateNumber(1, LIMIT2);
        var startProgression = Utils.generateNumber(1, LIMIT1);
        var hiddenIndex = Utils.generateNumber(1, LIMIT2);

        String[] progression = generateProgression(startProgression, stepProgression);
        var answer = progression[hiddenIndex];
        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, String.valueOf(answer)};
    }

    private static String[] generateProgression(int startProgression, int stepProgression) {
        int[] progression = new int[CAPACITY];
        progression[0] = startProgression;
        String[] stringProgression = new String[CAPACITY];
        stringProgression[0] = String.valueOf(startProgression);
        for (int i = 1; i < CAPACITY; i++) {
            progression[i] = startProgression + i * stepProgression;
            stringProgression[i] = String.valueOf(progression[i]);
        }
        return stringProgression;
    }

}