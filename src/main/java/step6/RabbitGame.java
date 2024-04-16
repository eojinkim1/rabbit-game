package step6;

import java.util.InputMismatchException;

public class RabbitGame {
    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoop();
        while (gameLoop.run());
    }
}
