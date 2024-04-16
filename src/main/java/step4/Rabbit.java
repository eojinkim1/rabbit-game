package step4;

import java.util.Random;

public class Rabbit {
    private static final Random RANDOM = new Random();
    private static final int MOVE_RANGE = 10;
    private int locationX = 0;
    public int move() {
        return locationX += RANDOM.nextInt(MOVE_RANGE * 2 + 1) - MOVE_RANGE;
    }
    public int position(){
        return locationX;
    }
}
