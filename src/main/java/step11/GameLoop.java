package step11;

import java.util.Scanner;

public class GameLoop {
    private static final Scanner SCANNER = new Scanner(System.in);
    public boolean run() {
        GameStart gameStart = new GameStart();
        while (true) {
            gameStart.game();
            if (!askRestart()) {
                return false;
            }
        }
    }
    public boolean askRestart() {
        while (true) {
            System.out.println("게임을 다시 시작하시겠습니까? ( Y / N )");
            String restart = SCANNER.next().toUpperCase();
            if (restart.equals("Y")) {
                System.out.println("새로운 게임을 시작합니다!!");
                System.out.println("-10 ~ 10 사이의 숫자를 입력하여 토끼가 있는 칸을 예측해주세요!");
                return true;
            } else if (restart.equals("N")) {
                System.out.println("게임을 종료합니다.");
                return false;
            }
            System.out.println("잘못된 입력입니다.");
        }
    }
}
