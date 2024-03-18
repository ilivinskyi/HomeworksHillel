package car;

public class Car {

    public Car() {}

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Starting electronics...");
    }

    private void startCommand() {
        System.out.println("Starting command...");
    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system...");
    }
}