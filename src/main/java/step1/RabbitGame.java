package step1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RabbitGame {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int RESULT = 1;
    public static void main(String[] args) {
        printGmaeRules();

        System.out.println("토끼잡기 게임 시작합니다!");

        while (true) {
            try {
                int rabbitLocation = getRandomLocation();
//                System.out.println("토끼가 이동합니다.");
                System.out.println("1~10 사이의 숫자를 입력하여 토끼가 있는 칸을 예측해주세요!");
//                System.out.println("토끼가 있는 곳 : " + rabbitLocation);
                int user = SCANNER.nextInt();

                if (user == rabbitLocation) {
                    System.out.println("토끼를 잡았습니다.");
                } else {
                    System.out.println("토끼가 이동했습니다.");
                    RESULT++;
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                SCANNER.next();
                continue;
            }
            System.out.println(RESULT + "번 만에 토끼를 잡았습니다.");
            while (true) {
                System.out.println("게임을 다시 시작하시겠습니까? ( Y / N )");
                String restart = SCANNER.next().toUpperCase();
                if (restart.equals("Y")) {
                    System.out.println("새로운 게임을 시작합니다.");
                    break;
                } else if (restart.equals("N")) {
                    System.out.println("게임을 종료합니다.");
                    return;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }
    }

    private static int getRandomLocation() {
        return RANDOM.nextInt(10) + 1;
    }

    private static void printGmaeRules() {
        System.out.println("===========================================");
        System.out.println("토끼잡기 게임 룰 설명");
        System.out.println("===========================================");

        System.out.println("*게임 목표*");
        System.out.println("10칸 중에 숨어있는 토끼를 찾아 잡는 게임입니다.");

        System.out.println("*게임 진행*");
        System.out.println("1. 컴퓨터가 토끼가 숨어있는 칸을 랜덤으로 선택합니다.");
        System.out.println("2. 플레이어는 1~10 사이의 숫자를 입력하여 토끼가 있는 칸을 추측합니다.");
        System.out.println("3. 플레이어가 입력한 숫자가 토끼가 있는 칸과 일치하면 토끼를 잡고 게임 종료됩니다.");
        System.out.println("4. 플레이어가 입력한 숫자가 토끼가 있는 칸과 일치하지 않으면 토끼가 이동하고 플레이어는 다시 숫자를 입력할 기회를 얻습니다.");

        System.out.println("*게임 종료*");
        System.out.println("토끼를 잡으면 게임이 종료됩니다.");
    }
}
