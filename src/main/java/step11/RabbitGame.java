package step11;

public class RabbitGame {
    public static void main(String[] args) {
        GameLoop gameLoop = new GameLoop();
        System.out.println("토끼 잡기 게임 시작입니다.");
        System.out.println("-10 ~ 10 사이의 숫자를 입력하여 토끼가 있는 칸을 예측해주세요!");
        gameLoop.run();
    }
}
