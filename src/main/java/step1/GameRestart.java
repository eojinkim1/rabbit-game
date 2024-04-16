package step1;

import java.util.Scanner;

public class GameRestart {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static boolean askRestart() {
        while (true) {
            System.out.println("게임을 다시 시작하시겠습니까? ( Y / N )");
            String restart = SCANNER.next().toUpperCase();
            if (restart.equals("Y")) {
                System.out.println("새로운 게임을 시작합니다.");
                return true;
            } else if (restart.equals("N")) {
                System.out.println("게임을 종료합니다.");
                return false;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
