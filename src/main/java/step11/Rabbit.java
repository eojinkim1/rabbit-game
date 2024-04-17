package step11;

import java.util.Random;

public class Rabbit {

    private static final Random RANDOM = new Random();
    private int rabbitPosition = 0;
    private static final int MOVE_RANGE = 10;
    public int move(){
        return rabbitPosition += RANDOM.nextInt(MOVE_RANGE * 2 + 1) - MOVE_RANGE;
    }
    public int getRabbitPosition(){
        return rabbitPosition;
    }
}
