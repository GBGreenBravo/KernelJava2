package policy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PolicySJF extends Policy {
    public void schedule(Customer[] customers) {
        PriorityQueue<Customer> queue = new PriorityQueue<>(Comparator.comparingInt(Customer::repairingTime));

        queue.addAll(Arrays.asList(customers));

        System.out.println("SJF 처리 방식: ");

        this.result(queue);
    }
}
