package step10;

import step8.GameRestart;

import java.util.InputMismatchException;
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
//            player = new Player();
//            rabbit = new Rabbit();
        }
    }
    public boolean askRestart() {
        while (true) {
            System.out.println("게임을 다시 시작하시겠습니까? ( Y / N )");
            String restart = SCANNER.next().toUpperCase();
            if (restart.equals("Y")) {
                System.out.println("새로운 게임을 시작합니다.");
                return true;
            } else if (restart.equals("N")) {
                return false;
            }
            System.out.println("잘못된 입력입니다.");
        }
    }
}
