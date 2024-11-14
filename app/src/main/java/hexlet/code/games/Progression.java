package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final int PROGRESSION_START = 100;
    public static final int PROGRESSION_STEP = 10;
    public static final int PROGRESSION_SIZE_LIMIT = 10;

    public static void run() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, "What number is missing in the progression?");
    }

    private static String[] generateRound() {

        var progressionStep = Utils.generateNumber(1, PROGRESSION_STEP);
        var progressionStart = Utils.generateNumber(1, PROGRESSION_START);
        var hiddenIndex = Utils.generateNumber(1, PROGRESSION_STEP);

        String[] progression = generateProgression(progressionStart, progressionStep, PROGRESSION_SIZE_LIMIT);
        var answerForHidden = progression[hiddenIndex];
        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);
        return new String[]{question, String.valueOf(answerForHidden)};
    }

    private static String[] generateProgression(int startProgression, int stepProgression, int lengthProgression) {
        String[] stringProgression = new String[lengthProgression];
        stringProgression[0] = String.valueOf(startProgression);
        for (int i = 1; i < lengthProgression; i++) {
            stringProgression[i] = String.valueOf(startProgression + i * stepProgression);
        }
        return stringProgression;
    }
}
