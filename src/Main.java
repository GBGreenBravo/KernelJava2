import policy.*;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("이영주", 0, 1),
                new Customer("이종찬", 2, 12),
                new Customer("장호윤", 5, 5),
                new Customer("문찬욱", 6, 6),
                new Customer("김찬규", 7, 3),
                new Customer("손민우", 9, 1),
                new Customer("송예진", 10, 3)
        };

        runProgram(customers);
    }

    private static void runProgram(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);

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
                case "F" -> policy = new FIFOPolicy();
                case "S" -> policy = new SJFPolicy();
                case "B" -> policy = new FIFOButFiveAndUnderFirstPolicy();
                default -> {
                    System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
                    System.out.println();
                    continue;
                }
            }

            serviceResult(policy.schedule(customers));
        }

        scanner.close();
    }

    private static void serviceResult(PriorityQueue<Customer> queue) {
        int currentTime = 0;
        int totalWaitingTime = 0;

        while (!queue.isEmpty()) {
            Customer customer = queue.poll();
            int startTime = Math.max(currentTime, customer.arrivalTime());
            int endTime = startTime + customer.repairingTime();
            int waitingTime = startTime - customer.arrivalTime();
            totalWaitingTime += waitingTime;

            System.out.println(customer.name() + ", 도착 시간: " + customer.arrivalTime() + "분, 소요시간: " + customer.repairingTime() + "분, 서비스 시작 시간: " + startTime +
                    "분, 기다린 시간: " + waitingTime + "분");

            currentTime = endTime;
        }

        System.out.println("총 기다린 시간: " + totalWaitingTime + "분");
        System.out.println();
    }
}