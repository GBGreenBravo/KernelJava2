package policy;

public record Customer(String name, int arrivalTime, int repairingTime) {
}

/*
public class Customer {
    private final String name;
    private final int arrivalTime;
    private final int repairingTime;

    public Customer(String name, int arrivalTime, int repairingTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.repairingTime = repairingTime;
    }

    public String getName() {
        return name;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getRepairingTime() {
        return repairingTime;
    }
}*/
