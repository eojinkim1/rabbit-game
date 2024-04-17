package step11;

public class GameStart {
    private Player player = new Player();
    private Rabbit rabbit = new Rabbit();

    public void game() {
        while (true) {
            System.out.println("내 위치 : " + player.move());
            System.out.println("토끼 위치 : " + rabbit.move());
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

