package adapter;

public class BusAdapterFromCar extends Bus implements Vehicle {
    @Override
    public void move() {
        busMove();
    }
}
