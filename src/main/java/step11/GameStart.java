package step11;

import java.util.InputMismatchException;

public class GameStart {
    private Player player = new Player();
    private Rabbit rabbit = new Rabbit();

    public void game() {
        while (true) {
            try {
                System.out.println("내 위치 : " + player.move());
                System.out.println("토끼 위치 : " + rabbit.move());
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("올바른 형식의 입력이 아닙니다. 다시 입력해주세요.");
                continue;
            }
            boolean isCatch = player.rabbitCatch(rabbit);
            if (isCatch) {
                System.out.println("토끼를 잡았습니다.");
                player = new Player();
                rabbit = new Rabbit();
                return;
            }
            System.out.println("토끼가 이동합니다.");
        }
    }
}

