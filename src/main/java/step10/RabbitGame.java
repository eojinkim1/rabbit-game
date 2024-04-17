package step10;

public class RabbitGame {
    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoop();
        System.out.println("토끼 잡기 게임 시작입니다.");
        gameLoop.run();
    }
}
