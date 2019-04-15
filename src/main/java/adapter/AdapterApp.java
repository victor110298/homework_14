package adapter;

public class AdapterApp {
    public static void main(String[] args) {
        Vehicle vehicle = new BusAdapterFromCar();
        vehicle.move();
    }
}
