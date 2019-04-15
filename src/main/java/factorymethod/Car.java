package factorymethod;

import lombok.ToString;

@ToString
public class Car implements Vehicle {
    private static Car instance = null;
    private boolean isTrunk;
    private int countOfWheels;

    private Car(boolean isTrunk, int countOfWheels) {
        this.isTrunk = isTrunk;
        this.countOfWheels = countOfWheels;
    }

    public static Car getInstance(boolean isTrunk, int countOfWheels) {
        if (instance == null) {
            instance = new Car(isTrunk, countOfWheels);
        }
        return instance;
    }

    @Override
    public String getVehicle() {
        return this.toString();
    }
}
