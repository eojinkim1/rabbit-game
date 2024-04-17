package step10;

import java.util.Scanner;

public class Player {
    private static final Scanner SCANNER = new Scanner(System.in);

    private int playerPosition = 0;
    public int move(){
        System.out.println("-10 ~ 10 사이의 숫자를 입력하여 토끼가 있는 칸을 예측해주세요!");
        return playerPosition += Integer.parseInt(SCANNER.next());
    }
    public boolean rabbitCatch(Rabbit rabbit){
        return playerPosition == rabbit.position();
    }
}
