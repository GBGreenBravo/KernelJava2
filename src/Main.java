import policy.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer[] customers = {
                new Customer("이영주", 0, 1),
                new Customer("이종찬", 2, 12),
                new Customer("장호윤", 5, 5),
                new Customer("문찬욱", 6, 6),
                new Customer("김찬규", 7, 3),
                new Customer("손민우", 9, 1),
                new Customer("송예진", 10, 3)
        };

        while (true) {
            System.out.println("먼저 온 고객을 먼저 서비스 하려면 F, 수리시간이 짧은 고객을 먼저 서비스 하려면 S, 선착순으로 하되 수리시간이 5분이하인 손님들을 먼저 서비스 하고 수리시간이 5분초과인 손님들을 나중에 서비스 하려면 B를 입력하세요.");
            System.out.println("끝내려면 Q를 입력하세요.");

            String userInput = scanner.next().toUpperCase();

            if (userInput.equals("Q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Policy policy;
            switch (userInput) {
                case "F" -> policy = new PolicyFIFO();
                case "S" -> policy = new PolicySJF();
                case "B" -> policy = new PolicyFIFOButFiveAndUnderFirst();
                default -> {
                    System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
                    System.out.println();
                    continue;
                }
            }

            policy.schedule(customers);
        }

        scanner.close();
    }
}