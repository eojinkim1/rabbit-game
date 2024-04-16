package step2;

import java.util.Random;

public class Rabbit {
    private static final Random RANDOM = new Random();
    private static final int MOVE_RANGE = 10;
    private int rabbitPosition = 0;

    public int move() {
        rabbitPosition += RANDOM.nextInt((MOVE_RANGE * 2) + 1) - MOVE_RANGE; // -10~10 표현
        return rabbitPosition;
    }
    public int getRabbitPosition() {
        return rabbitPosition;
    }
}
