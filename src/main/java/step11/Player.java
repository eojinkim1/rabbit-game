package step11;

import java.util.Scanner;

public class Player {
    private static final Scanner SCANNER = new Scanner(System.in);
    private int playerPosition = 0;
    public int move(){
        while (true){
            try {
                playerPosition = Integer.parseInt(SCANNER.next());
                if (playerPosition >= -10 && playerPosition <= 10) {
                    break; // 올바른 범위의 입력이면 반복문 탈출
                } else {
                    System.out.println("입력값은 -10에서 10 사이의 값이어야 합니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("입력값은 -10에서 10 사이의 값이어야 합니다.");
            }
        }
        return playerPosition;
    }
    public boolean rabbitCatch(Rabbit rabbit){
        return playerPosition == rabbit.getRabbitPosition();
    }
}
