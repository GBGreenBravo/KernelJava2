package policy;

import java.util.PriorityQueue;

public class Policy {
    public void schedule(Customer[] customers) {};
    protected void result(PriorityQueue<Customer> queue) {
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
