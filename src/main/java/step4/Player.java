package step4;

import java.util.Scanner;

public class Player {
    private static final Scanner SCANNER = new Scanner(System.in);

    private int playerLocation = 0;
    public int move(){
        return playerLocation += SCANNER.nextInt();
    }
    public boolean rabbitCatch(Rabbit rabbit){
        return playerLocation == rabbit.position();
    }
}
