package factorymethod;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Car implements Vehicle {
    private boolean isTrunk;
    private int countOfWheels;
    private static Car instance = null;

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