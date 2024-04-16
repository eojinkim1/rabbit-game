package step8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLoop {
    private static final Scanner SCANNER = new Scanner(System.in);
    public boolean run() {
        System.out.println("토끼 잡기 게임 시작입니다.");
        Player player = new Player();
        Rabbit rabbit = new Rabbit();

        while (true) {
            System.out.println("-10 ~ 10 사이의 숫자를 입력하여 토끼가 있는 칸을 예측해주세요!");
            try {
                System.out.println("내 위치 : " + player.move());
                if (player.move() < -10 || player.move() > 10){
                    throw new IllegalArgumentException("잘못된 입력입니다. -10 ~ 10 사이의 숫자를 입력하세요.");
                }
                System.out.println("토끼 위치 : " + rabbit.move());

                boolean isCatch = player.rabbitCatch(rabbit);
                if (isCatch) {
                    System.out.println("토끼를 잡았습니다.");
                    if (!GameRestart.askRestart()){
                        return false;
                    }
                    player.resetPosition();
                    rabbit.resetPosition();
                }
                System.out.println("토끼가 이동합니다.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요");
                SCANNER.next();
            }
        }
    }
}
