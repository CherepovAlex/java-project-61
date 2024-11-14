package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int startNumber, int endNumber) {
        return new Random().nextInt(startNumber, endNumber);
    }
}
