package step2;

import java.util.Scanner;

public class Player {
    private static final Scanner SCANNER = new Scanner(System.in);
    private int playerPosition = 0;
    public int move(){
        return playerPosition += SCANNER.nextInt();
    }
    public boolean rabbitCatch(Rabbit rabbit) {
        if (this.playerPosition == rabbit.getRabbitPosition()){
            return true;
        }
        return false;
    }
}
