package step1;

import java.util.Random;

public class Rabbit {
    private static final Random RANDOM = new Random();
    private static final int MOVE_RANGE = 10;

    private int locationX = 0;

    public int move() {
        int offset = RANDOM.nextInt(MOVE_RANGE + 1);
        if (isPlus()) {
            return locationX += offset;
        }
        return locationX -= offset;
    }

    private boolean isPlus() {
        return RANDOM.nextInt(2) == 0;
    }

    public int position() {
        return locationX;
    }
}
