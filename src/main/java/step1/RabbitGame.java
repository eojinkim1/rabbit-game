package step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RabbitGame {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("토끼잡기 게임 시작합니다!");

        Rabbit rabbit = new Rabbit();
        Player player = new Player();

        while (true) {
            try {
                System.out.println("-10 ~ 10 사이의 숫자를 입력하여 토끼가 있는 칸을 예측해주세요!");
                System.out.println("토끼 위치 : " + rabbit.move());
                System.out.println("내 위치 : " + player.move());

                boolean isCatch = player.rabbitCatch(rabbit);
                if (isCatch) {
                    System.out.println("토끼를 잡았습니다.");
                    return;
                }
                System.out.println("토끼가 이동했습니다.");
                continue;

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                SCANNER.next();
            }
            if (!GameRestart.askRestart()) {
                break;
            }
        }
    }
}

